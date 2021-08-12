package model.Produits;

public class KitSolaire extends  Produit{
    private double capaciteBaterie;
    private double dureDeVie;
    private boolean protectionElectrique;

    //le constructeur de KitSolaire
    public KitSolaire(String discreption,
                      String marque,
                      double prix,
                      int nmbDesArticlesEnStock,
                      int nmbDesArticlesReserves,
                      int nmbDesArticleVendu,
                      CategorieP categorieProduit,
                      double largeur,
                      double hauteur,
                      double epaisseur,
                      double poids,
                      double capaciteBaterie,
                      double dureDeVie,
                      boolean protectionElectrique) {
        super(discreption, marque, prix, nmbDesArticlesEnStock, nmbDesArticlesReserves, nmbDesArticleVendu, categorieProduit,
                largeur, hauteur, epaisseur, poids);

        this.capaciteBaterie = capaciteBaterie;
        this.dureDeVie = dureDeVie;
        this.protectionElectrique = protectionElectrique;
    }

    @Override
    public String toString() {
        return ( super.toString() +
                "capacite Baterie " + capaciteBaterie +
                ", dureDeVie=" + dureDeVie +
                ", protectionElectrique=" + protectionElectrique).replace("true","Oui")
                .replace("false","-").replace("null","-").replace("0","-");
    }
}
