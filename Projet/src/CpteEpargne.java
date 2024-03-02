/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 9 : Collectionner un nombre fixe d'objets
#	Section  : Projet
#	Fichier  : CpteEpargne.java
#	Class    : CpteEpargne
*/
import java.io.Serializable;
import java.util.*;
public class CpteEpargne extends Compte implements Serializable {
    private double  taux ;
    public CpteEpargne() {
        super("Epargne");
        taux = contreleTaux();
    }
    private double contreleTaux() {
        Scanner lectureClavier = new Scanner(System.in);
        double tmp;
        do {
            System.out.print("Taux de placement :     ");
            tmp = lectureClavier.nextDouble();
        } while (tmp < 0);
        return tmp;
    }
    public  void afficherCpte()   {
        super.AfficherCpte();
        System.out.println(" Taux d'epargne du compte :  " + taux);
    }
    public double quelTaux()	{
        return taux;
    }
}