package model.Commande;

import java.time.LocalDate;
import model.Produits.*;
import model.Utilisateur.*;
public class Commande {
    private Produit produitCommande;
    private Client client;
    private LocalDate dateDuCommande;
    private LocalDate delai;
    private boolean satisfaite;
    private boolean annulee; //quand une commande est annulee

    public Commande(Produit produitCommander,
                    Client client,
                    LocalDate delai ,
                    boolean statisfaite) {
        this.produitCommande = produitCommander;
        this.client = client;
        this.dateDuCommande = LocalDate.now();
        this.delai = delai;
        this.satisfaite=statisfaite;
        this.annulee=false;
    }


    @Override
    //la methode toString afficher une commande
    public String toString() {
        return "module.Commande: " +
                "module.Produit commandé " + produitCommande.getDiscreption() +
                "marque du produit "+
                ", Date Du module.Commande " + dateDuCommande +
                ", Delai " + delai +
                ", satisfaite " + satisfaite ;
    }


    //les getters et les setters
    public boolean isAnnulee() {
        return annulee;
    }

    public void setAnnulee(boolean annulee) {
        this.annulee = annulee;
    }

    public boolean isSatisfaite() {
        return satisfaite;
    }

    public void setSatisfaite(boolean satisfaite) {
        this.satisfaite = satisfaite;
    }

    public Produit getProduitCommande() {
        return produitCommande;
    }

    public void setProduitCommande(Produit produitCommande) {
        this.produitCommande = produitCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getDateDuCommande() {
        return dateDuCommande;
    }

    public void setDateDuCommande(LocalDate dateDuCommande) {
        this.dateDuCommande = dateDuCommande;
    }

    public LocalDate getDelai() {
        return delai;
    }

    public void setDelai(LocalDate delai) {
        this.delai = delai;
    }
}
