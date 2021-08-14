package model.Produits;

import java.util.Arrays;

public class Mobile extends OrdinateurEtMobile {

    private boolean support_cartes_memoire;
    private String type_de_cartes_supportees;
    private boolean double_SIM;
    private TypeConnecteurUSB typeUSB;
    private CameraMobile camera;
    private boolean batterie_amovible;
    private boolean recharge_sans_fil;

    /*Definition de l enum  Type USB*/
    public enum TypeConnecteurUSB{MicroUSB,TypeC,USB3};
    /*Defintion de la class Camera mobile*/
    public static class CameraMobile{

        private int[] capteurs;
        private boolean flash;
        private boolean capteurEnFacade;
        //Constructeur
        public CameraMobile(boolean flash,
                            boolean capteurEnFacade,
                            int...resolutionDescCapateur){
            this.flash = flash;
            this.capteurEnFacade=capteurEnFacade;
            this.capteurs = resolutionDescCapateur;
        }
        //methode d'affichage

        @Override
        public String toString() {
            return ('{' +
                    "capteurs " + Arrays //to change the [ and add the Méga pixel to the array
                                        .toString(capteurs)
                                        .replace("[","(")
                                        .replace(","," Méga pixel,")
                                        .replace("]"," Méga pixel)") +
                    ", Flash " + flash +
                    ", Capteur en Facade " + capteurEnFacade +
                    '}').replace("true","OUI").replace("false","-");
        }
    }



    public Mobile(String discreption,
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
                  double frequence_processeur,
                  String carte_graphique,
                  boolean support_cartes_memoire,
                  String type_de_cartes_supportees,
                  int ram,
                  int capacite_du_stockahge,
                  boolean double_SIM,
                  Ecran ecran,
                  int capacite_de_la_batterie,
                  TypeConnecteurUSB typeUSB,
                  CameraMobile camera,
                  boolean batterie_amovible,
                  boolean recharge_sans_fil) {
        super(discreption, marque, prix, nmbDesArticlesEnStock, nmbDesArticlesReserves, nmbDesArticleVendu, CategorieP.MOBILE
                , largeur,  hauteur, epaisseur,poids,systeme,ecran,processeur,nombre_de_coeurs,ram,capacite_du_stockahge,
                frequence_processeur,carte_graphique,capacite_de_la_batterie);

        this.support_cartes_memoire = support_cartes_memoire;
        this.type_de_cartes_supportees = type_de_cartes_supportees;
        this.double_SIM = double_SIM;
        this.typeUSB = typeUSB;
        this.camera = camera;
        this.batterie_amovible = batterie_amovible;
        this.recharge_sans_fil = recharge_sans_fil;

    }
    //la methode toString()
    @Override
    public String toString() {
        return (super.toString()+
                ", support cartes memoire "  + support_cartes_memoire +
                ", type de cartes supportees " + type_de_cartes_supportees +
                ", double_SIM " + double_SIM +
                ", typeUSB " + typeUSB +
                ", camera " + camera +
                ", batterie amovible " + batterie_amovible +
                ", recharge sans fil " + recharge_sans_fil).replace("true","Oui")
                .replace("false","-").replace("null","-");
    }
}
