package model.Produits;

public abstract class Produit  {


    private String marque;
    private String discreption;
    private double prix;
    private int nmbDesArticlesEnStock;
    private int nmbDesArticlesReserves;
    private int nmbDesArticleVendu;
    private double largeur;
    private double hauteur;
    private double epaisseur;
    private double poids;
    private CategorieP categorieProduit;

    //un constracteur qui intialise tout les variable sauf le id
    public Produit(String discreption,
                   String marque,
                   double prix,
                   int nmbDesArticlesEnStock,
                   int nmbDesArticlesReserves,
                   int nmbDesArticleVendu,
                   CategorieP categorieProduit,
                   double largeur,
                   double hauteur,
                   double epaisseur,
                   double poids) {

        this.discreption = discreption;
        this.marque= marque;
        this.prix = prix;
        this.nmbDesArticlesEnStock = nmbDesArticlesEnStock;
        this.nmbDesArticlesReserves = nmbDesArticlesReserves;
        this.nmbDesArticleVendu = nmbDesArticleVendu;
        this.categorieProduit = categorieProduit;
        this.poids=poids;

    }


    //la methode pour determiner si deux module.Produit sans egaux
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return (this.marque.equals(produit.getMarque())&&
                this.discreption.equals(produit.getDiscreption()));
    }

    //la methode pour afficher
    @Override
    public String toString() {
            return "Marque " + marque +
            ", Discreption " + discreption +
            ", Prix " + prix +"DA";

            }

    //les getters et les setters


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDiscreption() {
            return discreption;
            }

    public void setDiscreption(String discreption) {
            this.discreption = discreption;
            }

    public double getPrix() {
            return prix;
            }

    public void setPrix(double prix) {
            this.prix = prix;
            }

    public int getNmbDesArticlesEnStock() {
            return nmbDesArticlesEnStock;
            }

    public void setNmbDesArticlesEnStock(int nmbDesArticlesEnStock) {
            this.nmbDesArticlesEnStock = nmbDesArticlesEnStock;
            }

    public int getNmbDesArticlesReserves() {
            return nmbDesArticlesReserves;
            }

    public void setNmbDesArticlesReserves(int nmbDesArticlesReserves) {
            this.nmbDesArticlesReserves = nmbDesArticlesReserves;
            }

    public int getNmbDesArticleVendu() {
            return nmbDesArticleVendu;
            }

    public void setNmbDesArticleVendu(int nmbDesArticleVendu) {
            this.nmbDesArticleVendu = nmbDesArticleVendu;
            }

    public CategorieP getCategorieProduit() {
            return categorieProduit;
            }

    public void setCategorieProduit(CategorieP categorieProduit) {
            this.categorieProduit = categorieProduit;
            }

}
