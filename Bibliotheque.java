import java.util.Scanner;

public class Bibliotheque {
    public static void main(String[] args) {
        Livre livreDePoche = new Livre();
        Scanner lectureClavier = new Scanner(System.in);
       System.out.println("Entrez le nom du livre : ");
       livreDePoche.nom =  lectureClavier.nextLine();
        System.out.println(" Entrez  la categorie : ");
        livreDePoche.categorie = lectureClavier.nextLine();
        System.out.println(" Entrez le numéro ISBN : ");
        livreDePoche.Isbn = lectureClavier.nextInt();
        livreDePoche.afficherLivre(livreDePoche);
        livreDePoche.calculCode(livreDePoche.nom, livreDePoche.prenom, livreDePoche.categorie, livreDePoche.Isbn);
    }
}