import java.util.Scanner;

public class Cercle {
    public int x, y; //position au centre
    public int r; //rayon
    public static int nombre; // nombre de cercle;

    //afficher les données de la classe :
    public void afficher() {
        System.out.println(" Cercle centre en : " + x + "," + y);
        System.out.println(" de rayon : " + r);
    }

    // calcul du perimetre d'un cercle :
    public double perimetre() {
        return 2 * Math.PI * r;
    }

    // deplacer le cercle sur x et y :
    public void deplacer(int nx, int ny) {
        x = nx;
        y = ny;
    }

    //pareil pour le rayon :

    public void agrandir(int nr) {
        r = r + nr;
    }

    public void creer() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println(" position en x :  ");
        x = lectureClavier.nextInt();
        System.out.println(" poistion en y  :  ");
        y = lectureClavier.nextInt();
        System.out.println(" rayon          :");
        r = lectureClavier.nextInt();
        nombre++;
    }
    public void echanger(Cercle autre){
        //echanger la position d'un cercle  donné en parametre

        int tmp;
        tmp=x;
        x=autre.x;
        autre.x = tmp;
        tmp=y;
        y=autre.y;
        autre.y=tmp;
    }
}
