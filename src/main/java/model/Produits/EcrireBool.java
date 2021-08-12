package model.Produits;
/*
 *  durant l'affichage d'un objet il oblige de change le true par oui et le false par non
 *  cette classe implementer ça
 * */
public class EcrireBool {
    public static String ecrire(boolean bool){
        if(bool)
            return "oui";
        return "non";
    }
}