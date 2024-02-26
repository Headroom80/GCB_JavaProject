import java.util.Scanner;

public class StringManip {
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);
        String phrase = "";
        System.out.println(" saisissez une phrase : ");
        phrase = lectureClavier.nextLine();
        System.out.println("votre phrase en majuscule est : " + phrase.toUpperCase());
        System.out.println(" nombre de a dans la phrase : " + (phrase.length() - phrase.replaceAll("[aA]", "").length()));
        if (phrase.contains("a")) {
            System.out.println("remplacer les a par des * dans la phrase : " + phrase.replaceAll("[aA]", "*"));
        }else{
            System.out.println("votre phrase ne contient pas de 'a'");
        }
    }
}
