package model.Utilisateur;

public class AgentComercial extends Utilisateur{

    private String numSecuriteSocial;
    //le type enum de temps travaille
    private enum TempsDeTravaille{matin,soire;}
    private TempsDeTravaille tempsDeTravaille;
    //le constructeur  Agent Comercial
    public AgentComercial(String name, String prenom, int annee, int mois, int jour,
                          String adressEmail, String numeroTel, String ville,String motDePasse,
                          String numSecuriteSocial,TempsDeTravaille tempsDeTravaille) {
        super(name, prenom, annee, mois, jour, adressEmail, numeroTel, ville,motDePasse);
        this.numSecuriteSocial = numSecuriteSocial;
        this.tempsDeTravaille = tempsDeTravaille;
    }
    /* les methodes de gestions des produits */

    //une methode pour ajouter un produit
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

    //supprimer le compte
    @Override
    public void supprimerUtilisateur() {

    }
}
