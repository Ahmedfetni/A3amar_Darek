package model.Utilisateur;


import java.time.LocalDate;

public abstract class Utilisateur {


    private String motDePasse;
    private String name;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String ville;
    private String adressEmail;
    private String numeroTel;
    //Ce constructeur pour intialser tous les attributs sauf le id
    public Utilisateur(String name,
                       String prenom,
                       int annee,
                       int mois,
                       int jour,
                       String adressEmail,
                       String numeroTel,
                       String ville,
                       String motDePasse) {


        this.motDePasse = motDePasse;
        this.name = name;
        this.prenom = prenom;
        this.dateDeNaissance = LocalDate.of(annee,mois,jour);
        this.adressEmail = adressEmail;
        this.numeroTel=numeroTel;
        this.ville = ville;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(int annee , int mois, int jour) {
        this.dateDeNaissance = LocalDate.of(annee,mois,jour);
    }
    //la methode pour login des utilisateur
    public static Utilisateur login(String adressEmail , String numeroTel ,String motDePasse){
        return null;
    }

    //supprimer un utilisateur  une methode abstraite
    abstract public void supprimerUtilisateur();
}
