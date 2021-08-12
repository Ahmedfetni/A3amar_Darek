package model.Produits;

public class Ordinateur extends OrdinateurEtMobile {


    private boolean port_HDMI;
    private boolean port_Ethernet;
    private boolean ecran_tactile;
    private boolean smartCarte_reader;
    private boolean memoireVive_extensible;
    private boolean memoireDisque_extensible;
    private int definitionCapeurWebCam;
    private boolean lecteur_DVD;
    private TypeDisqueDur typeDisqueDur;
    private boolean lecteur_d_empreinte;
    private int nombrePortUSB;
    private String carte_mere;
    private TypeOrdinateur typeOrdinateur;

    //declaration de enum typeOrdinateur
    private enum TypeOrdinateur {
        Portable,Bureau;
    }
    //declaration de enum typeDisqueDur
    private enum TypeDisqueDur{
        SSD,HDD
    }

    //constructeur d'un module.Ordinateur bureau
    public Ordinateur(String discreption,
                      String marque,
                      double prix,
                      int nmbDesArticlesEnStock,
                      int nmbDesArticlesReserves,
                      int nmbDesArticleVendu,
                      double largeur,
                      double hauteur,
                      double epaisseur,
                      double poids,
                      String systeme,
                      String processeur,
                      int nombre_de_coeurs,
                      int ram,
                      int capacite_du_stockahge,
                      double frequence_processeur,
                      String carte_graphique,
                      boolean port_HDMI,
                      boolean port_Ethernet,
                      boolean smartCarte_reader,
                      boolean memoireVive_extensible,
                      boolean memoireDisque_extensible,
                      boolean lecteur_DVD,
                      TypeDisqueDur typeDisqueDur,
                      int nombrePortUSB,
                      String carte_mere) {
        super(discreption, marque, prix, nmbDesArticlesEnStock, nmbDesArticlesReserves, nmbDesArticleVendu, CategorieP.INFORMATIQUE, largeur, hauteur,
                epaisseur, poids,systeme, null, processeur, nombre_de_coeurs, ram, capacite_du_stockahge, frequence_processeur, carte_graphique, 0);
        this.port_HDMI = port_HDMI;
        this.port_Ethernet = port_Ethernet;
        this.smartCarte_reader = smartCarte_reader;
        this.memoireVive_extensible = memoireVive_extensible;
        this.memoireDisque_extensible = memoireDisque_extensible;
        this.lecteur_DVD = lecteur_DVD;
        this.typeDisqueDur = typeDisqueDur;
        this.nombrePortUSB = nombrePortUSB;
        this.carte_mere = carte_mere;
        this.typeOrdinateur = TypeOrdinateur.Bureau;
        this.definitionCapeurWebCam=0;
        this.ecran_tactile = false;
        this.lecteur_d_empreinte = false;
    }

    //constructeur d'un ordinateur portable

    public Ordinateur(String discreption, String marque, double prix, int nmbDesArticlesEnStock, int nmbDesArticlesReserves,
                      int nmbDesArticleVendu, double largeur, double hauteur, double epaisseur,double poids,
                      String systeme, Ecran ecran, String processeur, int nombre_de_coeurs, int ram, int capacite_du_stockahge,
                      double frequence_processeur, String carte_graphique, int capacite_du_batterie, int definitionCapeurWebCam,
                      boolean port_HDMI, boolean port_Ethernet, boolean ecran_tactile, boolean smartCarte_reader,
                      boolean memoireVive_extensible, boolean memoireDisque_extensible, boolean lecteur_DVD, TypeDisqueDur typeDisqueDur,
                      boolean lecteur_d_empreinte, int nombrePortUSB, String carte_mere) {

        super(discreption, marque, prix, nmbDesArticlesEnStock, nmbDesArticlesReserves, nmbDesArticleVendu,  CategorieP.INFORMATIQUE, largeur,
                hauteur, epaisseur,poids, systeme, ecran, processeur, nombre_de_coeurs, ram, capacite_du_stockahge, frequence_processeur,
                carte_graphique, capacite_du_batterie);

        this.port_HDMI = port_HDMI;
        this.port_Ethernet = port_Ethernet;
        this.ecran_tactile = ecran_tactile;
        this.smartCarte_reader = smartCarte_reader;
        this.memoireVive_extensible = memoireVive_extensible;
        this.memoireDisque_extensible = memoireDisque_extensible;
        this.definitionCapeurWebCam = definitionCapeurWebCam;
        this.lecteur_DVD = lecteur_DVD;
        this.typeDisqueDur = typeDisqueDur;
        this.lecteur_d_empreinte = lecteur_d_empreinte;
        this.nombrePortUSB = nombrePortUSB;
        this.carte_mere = carte_mere;
        this.typeOrdinateur = TypeOrdinateur.Portable;
    }

    //la fonction to String

    @Override
    public String toString() {
        return(super.toString() +
                "port_HDMI " + port_HDMI +
                ", port_Ethernet " + port_Ethernet +
                ", ecran_tactile " + ecran_tactile +
                ", smartCarte_reader " + smartCarte_reader +
                ", memoireVive_extensible " + memoireVive_extensible +
                ", memoireDisque_extensible " + memoireDisque_extensible +
                ", definitionCapeurWebCam " + definitionCapeurWebCam +
                ", lecteur_DVD " + lecteur_DVD +
                ", typeDisqueDur " + typeDisqueDur +
                ", lecteur_d_empreinte " + lecteur_d_empreinte +
                ", nombrePortUSB " + nombrePortUSB +
                ", carte_mere " + carte_mere  +
                ", typeOrdinateur " + typeOrdinateur.name()).replace("true","Oui")
                .replace("false","-").replace("null","-").replace("0","-");
        /*On remplace le mot anglais true par oui
           et le 0 ,nullet le false par cette tiret '-' */
    }
}
