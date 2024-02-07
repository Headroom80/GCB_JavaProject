import java.util.Scanner;

public class LireUnEntier {
    public static void main(String[] args) throws java.io.IOException {
    int nbBoucle = 0, randomNumber = (int) (10 * Math.random());
    int response;
    Scanner lectureClavier = new Scanner(System.in);
    System.out.println("Bonjour , entrez un chiffre pour tenté de deviner le chiffre caché");
    do {

        response = lectureClavier.nextInt();
        if (response > randomNumber) {
            System.out.println("Le chiffre caché est plus petit");
            nbBoucle++;
        } else if (response < randomNumber) {
            System.out.println("Le chiffre caché est plus grand !");
            nbBoucle++;
        }
        }while(response != randomNumber);
    System.out.println("vous avez gagner!");
    System.out.println("en : " + nbBoucle + " essais !");
    }
}
