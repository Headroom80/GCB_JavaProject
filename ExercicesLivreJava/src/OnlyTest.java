
import java.util.ArrayList;

public class OnlyTest {
    public static void main(String[] args) {
//        String str = "JEAN", str2 ="YVES", categorie = "epouvante";
//        int isbn = 1234;
//
//        test(str,str2,categorie,isbn);
//    }
//
//    public static String test(String str, String str2,String categorie,long isbn) {
//        String combinedStr = str + str2;
//        int nom = str.length();
//        long test = isbn;
//        test = test % 100;
//       char[] charArray =  combinedStr.toCharArray();
//        String resultat="";
//        for (var i = 0; i< charArray.length; i++){
//            resultat = ""+charArray[0] + charArray[1] + charArray[nom] + charArray[nom+ 1];
//        }
//        resultat += ""+categorie + test;
//        System.out.println(resultat);
//        return resultat;
//        double [] notes = {8,10,12.5,4,3,2,1};
//        for ( var i = 0 ; i < notes.length; i++){
//            System.out.println("Entrez la notes n°" + (i + 1) + " : ");
        int boite = 10;
        ArrayList liste = new ArrayList(boite);
        liste.add(0,"non");
        System.out.println(liste.indexOf("oui"));
        if(liste.indexOf("oui") < 0){
            System.out.println("oui n 'est pas dans le tableau");
        }
        if(!liste.contains("non")){
            System.out.println("il n'y a pas de non");
        }else{
            System.out.println("il y'a un non");
        }


        }

    }