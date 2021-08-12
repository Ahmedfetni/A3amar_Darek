package model.Utilisateur;

import model.Produits.*;

import java.time.Duration;
import java.time.LocalDate;
import model.Commande.*;
public class Client extends Utilisateur {

    //les attributs
    private EtatFidelite etatFidelite;
    //la class etat de fidelite qui permet au client de s'on profiter des remises
    private class EtatFidelite{
        double cumulDesAchats_InformatiqueEtMobile;
        double cumulDesAchats_Electro;//electromenage et electronique
        double getCumulDesAchats_KitSol;
        //le constructeur
        EtatFidelite() {

            this.cumulDesAchats_InformatiqueEtMobile = 0;
            this.cumulDesAchats_Electro = 0;
            this.getCumulDesAchats_KitSol = 0;
        }

        //Une fonction pour calculer le montant apres la remise
        double calculeMontantApresDecompt(Produit produit){
            if(produit.getCategorieProduit().ordinal() == 0 ||
                    produit.getCategorieProduit().ordinal()==2)
                return produit.getPrix()- 0.05*this.cumulDesAchats_InformatiqueEtMobile;
            else if (produit.getCategorieProduit().ordinal() ==  4)
                return produit.getPrix()-0.15*this.getCumulDesAchats_KitSol;
            else
                return produit.getPrix()-0.15*this.cumulDesAchats_Electro;
        }
        //les modificateurs des cumuls
        public void setCumulDesAchats_InformatiqueEtMobile(double cumulDesAchats_InformatiqueEtMobile) {
            this.cumulDesAchats_InformatiqueEtMobile = cumulDesAchats_InformatiqueEtMobile;
        }

        public void setCumuleDesAchats_Electro(double cumuleDesAchats_Electro) {
            this.cumulDesAchats_Electro = cumuleDesAchats_Electro;
        }

        public void setGetCumulDesAchats_KitSol(double getCumulDesAchats_KitSol) {
            this.getCumulDesAchats_KitSol = getCumulDesAchats_KitSol;
        }
    }

    //le constructeur de client
    public Client(String name, String prenom, int annee, int mois, int jour,
                  String adressEmail, String numeroTel,String ville ,String motDePasse) {
        super(name, prenom, annee, mois, jour,adressEmail,numeroTel,ville,motDePasse);
        this.etatFidelite = new EtatFidelite();
    }

    //les getters et les setters
    public EtatFidelite getEtatFidelite() {
        return etatFidelite;
    }
    public void setEtatFidelite(EtatFidelite etatFidelite) {
        this.etatFidelite = etatFidelite;
    }

    //Une methode pour commander un produit
    public Commande commanderUnProduit(Produit produit, LocalDate delai){
        return new Commande(produit,this,delai,false);
    }
    //Annuler une commande
    public void annulerUneCommande(Commande commande){
        Duration duration = Duration.between(LocalDate.now(),commande.getDateDuCommande());
        if(duration.toDays() < 3) //on peut annuler une commande seulement dans les 3 premier jours du commmande
            commande.setAnnulee(true);
    }
    //Une methode pour marquer une commander comme satisfaute
    public void marquerCommeSatisfaite(Commande commande){
        commande.setSatisfaite(true);
    }
    @Override
    //la methode supprimer un client
    public void supprimerUtilisateur() {

    }
}
