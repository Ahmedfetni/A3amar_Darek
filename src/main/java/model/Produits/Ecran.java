package model.Produits;
/*
 * La class ecran pour une defintion des cracteristique dun ecrant;
 * */
public class Ecran {
    private double taille;
    private Definition_d_ecrant definition;
    private String technologie;
    //la class défintion d'ecran
    public enum Definition_d_ecrant{
        SD("720x576 pixels"),HD("1280x720 pixels"),FULL_HD("1920x1080 pixels"),_2k("2560x1440 pixels / 2040x1440 pixels"),
        _4k("3840x2160 pixels / 4096x2160 pixels"),_8K("7680x4320 pixels");
        final public String definition;
        //le constructeur
        Definition_d_ecrant(String definition) {
            this.definition = definition;
        }
    }
    //Constructeur d'un ecran
    public Ecran(double taille, Definition_d_ecrant definition, String technologie) {
        this.taille = taille;
        this.definition = definition;
        this.technologie = technologie;
    }
    //La fonction pour ecrire un ecran

    @Override
    public String toString() {
        return '{' + taille + "pouce, " + definition.definition + ", technologie " + technologie + '}';
    }
}
