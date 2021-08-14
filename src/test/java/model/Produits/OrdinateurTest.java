package model.Produits;

import org.junit.jupiter.api.Assertions;

class OrdinateurTest {

    @org.junit.jupiter.api.Test
    void testToString1() {
        Ordinateur ordinateurBureau = new Ordinateur(
                "descreption1",
                "marque1",
                111.1,
                100,
                0,
                0,
                3,
                6,
                1,
                20,
                "System1",
                "processeur1",
                4,
                16,
                500,
                3.7,
                "carte graphique",
                true,
                true,
                true,
                false,
                false,
                true,
                Ordinateur.TypeDisqueDur.SSD,
                6,
                "Carte Mère nom"
        );
        Ecran ecranLaptop= new Ecran(40,Ecran.Definition_d_ecrant._2k,"lcd");
        Ordinateur ordinateurPortable= new Ordinateur(
                "descreption1",
                "marque1",
                111.1,
                100,
                0,
                0,
                3,
                6,
                1,
                20,
                "System1",
                "processeur1",
                4,
                16,
                500,
                3.7,
                "carte graphique",
                ecranLaptop,
                4000,
                32,
                false,
                false,
                true,
                true,
                false,
                false,
                false,
                true,
                Ordinateur.TypeDisqueDur.SSD,
                6,
                "Carte Mère nom"
        );
        String expectedBureau= "Marque " + "marque1"+
                ", Discreption " + "descreption1"+
                ", Prix "+111.1+"DA"+
                ", système " + "System1" +
                ", écran " + '-'+
                ", processeur " + "processeur1"+
                ", nombre_de_coeurs " + 4 +
                ", frequence_processeur " + 3.7 +"GHz"+
                ", ram " + 16+"GB"+
                ", capacite_du_stockahge " + 500 +"GB"+
                ", carte_graphique " + "carte graphique"+
                ", capacite_du_batteri " + 0 +"mAH"+
                ", port_HDMI " + "Oui" +
                ", port_Ethernet " + "Oui" +
                ", ecran_tactile " + "-" +
                ", smartCarte_reader " + "Oui" +
                ", memoireVive_extensible " + "-" +
                ", memoireDisque_extensible " + "-" +
                ", definitionCapeurWebCam " + "0" +
                ", lecteur_DVD " + "Oui" +
                ", typeDisqueDur " + "SSD" +
                ", lecteur_d_empreinte " + "-" +
                ", nombrePortUSB " + 6 +
                ", carte_mere " + "Carte Mère nom"  +
                ", typeOrdinateur " + "Bureau";


        String expectedPortable =  "Marque " + "marque1"+
                ", Discreption " + "descreption1"+
                ", Prix "+111.1+"DA"+
                ", système " + "System1" +
                ", écran " + ecranLaptop+
                ", processeur " + "processeur1"+
                ", nombre_de_coeurs " + 4 +
                ", frequence_processeur " + 3.7 +"GHz"+
                ", ram " + 16+"GB"+
                ", capacite_du_stockahge " + 500 +"GB"+
                ", carte_graphique " + "carte graphique"+
                ", capacite_du_batteri " + 4000 +"mAH"+
                ", port_HDMI " + "Oui" +
                ", port_Ethernet " + "Oui" +
                ", ecran_tactile " + "-" +
                ", smartCarte_reader " + "-" +
                ", memoireVive_extensible " + "-" +
                ", memoireDisque_extensible " + "-" +
                ", definitionCapeurWebCam " + 32 +
                ", lecteur_DVD " + "Oui" +
                ", typeDisqueDur " + "SSD" +
                ", lecteur_d_empreinte " + "-" +
                ", nombrePortUSB " + 6 +
                ", carte_mere " + "Carte Mère nom"  +
                ", typeOrdinateur " + "Portable";
        //assertion pour l'instance Ordinateur Bureau
        Assertions.assertEquals(expectedBureau,ordinateurBureau.toString());
        //assertion pout l'instance Ordinateur Portable
        Assertions.assertEquals(expectedPortable,ordinateurPortable.toString());
    }
}