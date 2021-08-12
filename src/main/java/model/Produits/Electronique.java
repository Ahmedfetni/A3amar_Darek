package model.Produits;

public class Electronique extends Produit {
    private boolean avecEcrant;
    private boolean avecBleutooth;
    private boolean avecUneBatrie;
    private double energie;

    public Electronique(String discreption,
                        String marque,
                        double prix,
                        int nmbDesArticlesEnStock,
                        int nmbDesArticlesReserves,
                        int nmbDesArticleVendu,
                        CategorieP categorieProduit,
                        boolean avecEcrant,
                        boolean avecBleutooth,
                        boolean avecUneBatrie,
                        double energie ,
                        double largeur ,
                        double hauteur,
                        double epaisseur,
                        double poids) {
        super(discreption, marque, prix, nmbDesArticlesEnStock, nmbDesArticlesReserves, nmbDesArticleVendu,CategorieP.ELECTRONIQUE,largeur,hauteur,epaisseur,poids);
        this.avecEcrant = avecEcrant;
        this.avecBleutooth = avecBleutooth;
        this.avecUneBatrie = avecUneBatrie;
        this.energie = energie;
    }
    //constructeur

    @Override
    public String toString() {
        return
                " à un écrant=" + avecEcrant +
                        ", avec Bleutooth=" + avecBleutooth +
                        ", avec Une Batrie=" + avecUneBatrie +
                        ", énergie " + energie +"watt/heurs";
    }
}
