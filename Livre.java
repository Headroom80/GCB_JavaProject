     public class Livre {
    public String titre;
    public String nom;
    public String prenom;
    public  String categorie;
    public long Isbn;
    public String UniqueAlphaCode;

    public  void afficherLivre(Livre livre) {
        System.out.println(livre.titre);
        System.out.println(livre.nom);
        System.out.println(livre.prenom);
        System.out.println(livre.categorie);
        System.out.println(livre.Isbn);
    }
         public  String calculCode(String str, String str2,String categorie,long isbn) {
             String combinedStr = str + str2;
             int nom = str.length();
             long test = isbn;
             test = test % 100;
             char[] charArray =  combinedStr.toCharArray();
             String resultat="";
             for (var i = 0; i< charArray.length; i++){
                 resultat = ""+charArray[0] + charArray[1] + charArray[nom] + charArray[nom+ 1];
             }
             resultat += " " +categorie + test;
             System.out.println(resultat);
             return resultat;

         }

}
