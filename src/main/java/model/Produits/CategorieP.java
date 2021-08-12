package model.Produits;

public enum CategorieP {
    MOBILE,ELECTRONIQUE,INFORMATIQUE,ELECTROMENAGERS,KITSOL;
    public String nameOf(){
        String theName = null;
        switch (this){
            case MOBILE:
                theName = "module.Mobile";
                break;
            case ELECTRONIQUE:
                theName= "module.Electronique";
                break;
            case INFORMATIQUE:
                theName="Informatique";
                break;
            case ELECTROMENAGERS:
                theName="Electromenagers";
                break;
            case KITSOL:
                theName="Kit Solaire";
                break;
            default:
                break;
        }
        return theName;
    }
    public static String[] lesCategoriesP(){
        return new String[]{"module.Mobile","module.Electronique","Informatique","Electromenagers","Kit Solaire"};
    }
}
