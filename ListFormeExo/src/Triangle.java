/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre ind�termin� d'objets 
#	Exercice   : Support pour r�aliser les exercices 10.2 et 10.7
#	Fichier    : Triangle.java
#	Class      : Triangle
*/

public class Triangle extends Forme {
 
 private int xB, yB, xC, yC;
 
 public Triangle(int nxa, int nya, int nxb, int nyb, int nxc, int nyc, int nc )	{
   super(nxa, nya, nc);
   xB = verifier(nxb, 0, largeurEcran);
   yB = verifier(nyb, 0, hauteurEcran);
   xC = verifier(nxc, 0, largeurEcran);
   yC = verifier(nyc, 0, hauteurEcran);
 }

 public Triangle()	{  
    xB = verifier("second sommet en X : ", 0, largeurEcran);
    yB = verifier("second sommet en Y : ", 0, hauteurEcran);
    xC = verifier("troisieme sommet en X : ", 0, largeurEcran);
    yC = verifier("troisieme sommet en Y : ", 0, hauteurEcran);
  }
 
 public void afficher()  {
   super.afficher();
   System.out.println("Position en " +  xB + ", " + yB); 
   System.out.println("Position en " +  xC + ", " + yC); 
 }
 
 public void deplacer(int nx, int ny){
 	super.deplacer(nx, ny);
 	xB = verifier(xB+nx, 0, largeurEcran);
 	yB = verifier(yB+ny, 0, hauteurEcran);	
	xC = verifier(xC+nx, 0, largeurEcran);
 	yC = verifier(yC+ny, 0, hauteurEcran);		
 }
    @Override
    public String toString() {
        return " Triangle A"+ x;
    }
 
} // Fin de la classe Ellipse