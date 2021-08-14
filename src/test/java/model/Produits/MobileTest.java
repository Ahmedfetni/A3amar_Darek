package model.Produits;


import org.junit.jupiter.api.Assertions;



class MobileTest {
    /*Tester la methode toString*/
    @org.junit.jupiter.api.Test
    void testToString() {
        Ecran ecranMobile =new Ecran(5.5,Ecran.Definition_d_ecrant.FULL_HD,"LCD");
        Mobile.CameraMobile camera =new Mobile.CameraMobile(true, true, 20,40);
        Mobile mobile = new Mobile(
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
                4.5,
                "carte graphique",
                true,
                "nano",
                4,
                64,
                true,
                ecranMobile,
                3000,
                Mobile.TypeConnecteurUSB.MicroUSB,
                camera,
                true,
                false
        );
        String expected = "Marque " + "marque1"+
                ", Discreption " + "descreption1"+
                ", Prix "+111.1+"DA"+
                ", système " + "System1" +
                ", écran " + ecranMobile+
                ", processeur " + "processeur1"+
                ", nombre_de_coeurs " + 4 +
                ", frequence_processeur " + 4.5 +"GHz"+
                ", ram " + 4 +"GB"+
                ", capacite_du_stockahge " + 64 +"GB"+
                ", carte_graphique " + "carte graphique"+
                ", capacite_du_batteri " + 3000 +"mAH"+
                ", support cartes memoire "  + "Oui" +
                ", type de cartes supportees " + "nano" +
                ", double_SIM " + "Oui"+
                ", typeUSB " + "MicroUSB" +
                ", camera " + camera +
                ", batterie amovible " +"Oui" +
                ", recharge sans fil " + "-"
                ;
        // to debug System.out.println(mobile);
        //Assert.assertEquals(expected,mobile.toString());
        Assertions.assertEquals(expected,mobile.toString());


    }
}