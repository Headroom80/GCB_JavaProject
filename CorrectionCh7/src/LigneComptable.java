/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 7 : Les classes et les objets
#	Section  : Projet - Le type LigneComptable
#	Fichier  : LigneComptable.java
#	Class    : LigneComptable
*/

import java.util.*;

public class LigneComptable {
    public double valeur;
    public String date;
    public String motif;
    public String mode;

    public void creerLigneComptable() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrer la valeur a crediter (+) ou debiter (-) : ");
        valeur = lectureClavier.nextDouble();
        System.out.print("Date de l'operation [jj/mm/an] ");
        date = Lire.S();
        System.out.print("Entrer le motif  [S(alaire), L(oyer), A(limenation), D(ivers)] : ");
        motif = lectureClavier.next();
        System.out.print("Entrer le mode [C(B), N(� Cheque), V(irement ) ] : ");
        mode = lectureClavier.next();
    }

    public void afficherLigne() {
        if (valeur < 0)
            System.out.print("Debiter : " + valeur);
        else
            System.out.print("Crediter : " + valeur);
        System.out.println(" le : " + date + " motif  : " + motif + " mode : " + mode);
    }
}