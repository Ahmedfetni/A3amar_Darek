package model.Produits;


public class Electromenager extends Produit {
    private double alimentationElectrique;
    private String classEnergitique;

    //Cinstructeur
    public Electromenager(String discreption,
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
                          double alimentationElectrique,
                          String classEnergitique) {
        super(discreption, marque, prix, nmbDesArticlesEnStock, nmbDesArticlesReserves, nmbDesArticleVendu, categorieProduit, largeur, hauteur, epaisseur, poids);
        this.alimentationElectrique = alimentationElectrique;
        this.classEnergitique = classEnergitique;
    }

    //la methode  toString
    @Override
    public String toString() {
        return (super.toString() +
                ", Alimentation Electrique " + alimentationElectrique + "V" +
                ", Class Energitique " + classEnergitique).replace("true", "Oui")
                .replace("false", "-").replace("null", "-");

    }
}
