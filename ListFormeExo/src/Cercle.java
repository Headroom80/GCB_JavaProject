/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre ind�termin� d'objets 
#	Exercice   : Support pour r�aliser les exercices 10.2 et 10.7
#	Fichier    : Cercle.java
#	Class      : Cercle
*/

public class Cercle extends Forme {
 private int rayon ;
 
 public Cercle(int nx, int ny, int nr, int nc){
   super(nx, ny, nc);
   rayon = verifier(nr, 0, hauteurEcran);
 }
 public Cercle()	{
    rayon = verifier("Rayon : ", 0, hauteurEcran);
  }
 
 public void afficher()  {
  super.afficher();
  System.out.println("Rayon : " + rayon);
 }
    @Override
    public String toString() {
        return " Cercle C"+rayon;
    }

} 