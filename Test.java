import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    double premier, deuxieme,resultat;
    String operateur;
    Scanner lectureClavier = new Scanner(System.in);
    System.out.println("Entrez un nombre : ");
    premier = lectureClavier.nextDouble();
    System.out.println("Entrez un deuxième nombre : ");
    deuxieme = lectureClavier.nextDouble();
    System.out.println("entrez un opérateur : ");
     operateur = lectureClavier.next();
    switch (operateur) {
        case "+":
            resultat = premier + deuxieme;
            System.out.println("le résultat est : " + resultat);
            break;
        case "-":
            resultat = premier - deuxieme;
            System.out.println("le résultat est : " + resultat);
            break;
        case "*":
            resultat = premier * deuxieme;
            System.out.println("le résultat est : " + resultat);
            break;
        case "/":
            if (deuxieme == 0) {
                System.out.println("division par zéro impossible");
                System.exit(0);
            }else {
                resultat = premier / deuxieme;
                System.out.println("le résultat est : " + resultat);
            }
            break;
        default:
            System.out.println("opérateur non reconnu");
        }
    }
}
