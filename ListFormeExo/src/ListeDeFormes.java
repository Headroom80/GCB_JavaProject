import java.util.ArrayList;
import java.util.Scanner;

public class ListeDeFormes {

    private ArrayList<Forme> listeFormes;

    public ListeDeFormes(){
        listeFormes = new ArrayList<Forme>();
    }
    public void ajouterForme(Forme f){
        Scanner lectureClavier = new Scanner(System.in);
        char tmpc;
        System.out.println("Ajouter un T(riangle), C(ercle), R(ectangle)");
        tmpc = lectureClavier.next().toUpperCase().charAt(0);
        switch (tmpc){
            case 'T':
                listeFormes.add(0,f.)
                break;
            case 'C':
                break;
            case 'R':
                break;
            default:
                System.out.println("Option non reconnue");
                break;
        }


    }
}
