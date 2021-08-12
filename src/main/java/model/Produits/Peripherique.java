package model.Produits;

public class Peripherique extends Produit {
    private boolean sansFile;
    private boolean pilot;
    private boolean rechargable;

    //constructeur d'un peripherique
    public Peripherique(String discreption,
                        String marque,
                        double prix,
                        int nmbDesEnStock,
                        int nmbDesArticlesReserves,
                        int nmbDesArticleVendu,
                        double largeur,
                        double hauteur,
                        double epaisseur ,
                        double  poids,
                        boolean sansFile,
                        boolean pilot,
                        boolean rechargable) {
        super(discreption,marque,prix, nmbDesEnStock, nmbDesArticlesReserves, nmbDesArticleVendu, CategorieP.INFORMATIQUE, largeur,  hauteur, epaisseur,poids);
        this.sansFile = sansFile;
        this.pilot = pilot;
        this.rechargable = rechargable;
    }
    //les getters et les setters

    public boolean isSansFile() {
        return sansFile;
    }
    public void setSansFile(boolean sansFile) {
        this.sansFile = sansFile;
    }

    //la methode toString()
    @Override
    public String toString() {
        return
                (super.toString()+
                        "sansFile " + sansFile +
                        ", Besoin d'un pilot " + pilot +
                        ", rechargable " + rechargable).replace("false","-")
                        .replace("true","Oui").replace("null","-")
                        .replace("0","-");
    }
}

