package model.Utilisateur;

import model.Produits.*;
import java.time.LocalDate;

public class administrateur extends Utilisateur {

    public administrateur(String name, String prenom, int annee, int mois,
                          int jour, String adressEmail, String numeroTel, String ville,
                          String motDePasse) {
        super(name, prenom, annee, mois, jour, adressEmail, numeroTel, ville, motDePasse);
    }

    public void ajouterUnPorduit(){

    }
    //une methode pour ajouter un produit
    public void SupprimerUnPorduit(){

    }
    /* les methodes de gestions des Clients*/
    public void ajouterUnClient(){

    }
    public void SupprimerUnClient(){

    }
    /*les methodes de gestions  des agents comercial*/
    public void ajouterUnAgent(){

    }
    public void SupprimerUnAgent(){

    }
    /*Les fonctions des statistique */
    public Produit leProduitLePlusVendu(){
        return null;
    }

    public Produit leProduitLePlusVenduParCategorie(CategorieP categorieP){
        return null;
    }

    public Produit leProduitLePlusVenduDansUnePeriode(LocalDate debutDuPeriode, LocalDate finDuPeriode){
        return null;
    }

    public int[] totaleDuVentParCategorie(){
        return null;
    }

    public double[] CumuleDuVentParCategorie(){
        return null;
    }

    public double[] cumuleDuVentParProduit(){
        return null;
    }

    public String adresseLaPlusFrequent(){
        return null;
    }
    public Produit produitLePlusReserver(){
        return null;
    }
    @Override
    public void supprimerUtilisateur() {

    }
}
