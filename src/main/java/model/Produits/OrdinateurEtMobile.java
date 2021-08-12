package model.Produits;

public abstract class OrdinateurEtMobile extends Produit {

    private String systeme;
    private Ecran ecran;
    private String processeur;
    private int nombre_de_coeurs;
    private  double frequence_processeur;
    private int ram;
    private int capacite_du_stockahge;
    private String carte_graphique;
    private int capacite_du_batterie;



    public OrdinateurEtMobile(String discreption, String marque, double prix, int nmbDesArticlesEnStock, int nmbDesArticlesReserves,
                              int nmbDesArticleVendu, CategorieP categorieProduit, double largeur, double hauteur, double epaisseur,double poids,
                              String systeme, Ecran ecran, String processeur, int nombre_de_coeurs, int ram, int capacite_du_stockahge,
                              double frequence_processeur, String carte_graphique, int capacite_du_batterie) {
        super(discreption, marque, prix, nmbDesArticlesEnStock, nmbDesArticlesReserves, nmbDesArticleVendu, categorieProduit, largeur,
                hauteur, epaisseur,poids);
        this.systeme = systeme;
        this.ecran = ecran;
        this.processeur = processeur;
        this.nombre_de_coeurs = nombre_de_coeurs;
        this.frequence_processeur = frequence_processeur;
        this.ram = ram;
        this.capacite_du_stockahge = capacite_du_stockahge;
        this.carte_graphique=carte_graphique;
        this.capacite_du_batterie=capacite_du_batterie;

    }
    //La fonction d'affichage
    @Override
    public String toString() {
        return super.toString() +
                "système " + systeme +
                ", écran " + ecran.toString() +
                ", processeur " + processeur +
                ", nombre_de_coeurs " + nombre_de_coeurs +
                ", frequence_processeur " + frequence_processeur +"GHz"+
                ", ram " + ram +"GB"+
                ", capacite_du_stockahge " + capacite_du_stockahge +"GB"+
                ", carte_graphique " + carte_graphique +
                ", capacite_du_batteri =" + capacite_du_batterie +"mAH";
    }
}
