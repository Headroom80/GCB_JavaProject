import java.util.Scanner;

public class MachineCafe {
    public static void main(String[] args) {
        int nbPiece5sct = 0, nbPiece10sct = 0, nbPiece20sct = 0, piece;
        int totalRecu = 0;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Pour obtenir un café , tu dois mettres au moins 45 centimes fdp.");
        System.out.println("Y'a moyen j'te rends la monnaie");
        do {
            System.out.println("Entrez votre piece de monnaie");
            piece = lectureClavier.nextInt();
            switch (piece) {
                case 5:
                    nbPiece5sct++;
                    break;
                case 10:
                    nbPiece10sct++;
                    break;
                case 20:
                    nbPiece20sct++;
                    break;
                default:
                    piece = 0;
                    System.out.println("Ce n'est pas la bonne pièce");
                    break;
            }
            totalRecu = totalRecu + piece;
            System.out.println("vous avez entré");
            System.out.println("    " + nbPiece5sct + "pieces de 5 centimes");
            System.out.println("    " + nbPiece10sct+ " pieces de 10 centimes");
            System.out.println("    " + nbPiece20sct+ " pieces de 20 centimes");
            System.out.println(" vous avez rentré : " + totalRecu + " de centimes d'euro.");
        }
        while (totalRecu < 45);
        System.out.println(" Vous avez entré assez de thune pour vous payer un café gg .");
        if (totalRecu > 45){
            System.out.println(" je vous dois : " + (totalRecu - 45) + " centimes");
        }
    }
}
