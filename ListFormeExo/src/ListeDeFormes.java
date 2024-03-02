import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListeDeFormes {

    private ArrayList<Forme> listeFormes;
    int listeIndex = 0;

    public ListeDeFormes(){
        listeFormes = new ArrayList<Forme>();
    }
    public void ajouterForme(){
        Scanner lectureClavier = new Scanner(System.in);
        int tmpc;
        Forme tmpf;
        do {
            System.out.println("1: ajouter un Triangle : ");
            System.out.println("2: ajouter un Cercle : ");
            System.out.println("3: ajouter un Rectangle : ");
            System.out.println("4: afficher la liste : ");
            tmpc = lectureClavier.nextInt();
            switch (tmpc) {
                case 1:
                    tmpf = new Triangle();
                    listeFormes.add(listeIndex, tmpf);
                    listeIndex++;
                    break;
                case 2:
                    tmpf = new Cercle();
                    listeFormes.add(listeIndex, tmpf);
                    listeIndex++;
                    break;
                case 3:
                    tmpf = new Rectangle();
                    listeFormes.add(listeIndex, tmpf);
                    listeIndex++;
                    break;
                case 4:
                    afficherListe();
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Option non reconnue");
                    break;
            }
        }while (tmpc != 5);


    }
    public void afficherListe(){
        for(Forme forme: listeFormes){
            System.out.println(forme);
        }
    }
}
