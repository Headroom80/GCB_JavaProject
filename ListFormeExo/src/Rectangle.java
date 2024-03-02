/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre ind�termin� d'objets 
#	Exercice   : Support pour r�aliser les exercices 10.2 et 10.7
#	Fichier    : Rectangle.java
#	Class      : Rectangle
*/


public class Rectangle extends Forme {

 private int largeur, hauteur  ; 
 public Rectangle(int nx, int ny, int nl, int nh, int nc)	{
   super(nx, ny, nc);
   couleur = 10;
   largeur = verifier(nl, 0, largeurEcran);
   hauteur = verifier(nh, 0, hauteurEcran);
 }
 
 public Rectangle()	{
    largeur = verifier("Largeur", 0, largeurEcran);
    hauteur = verifier("Hauteur", 0, hauteurEcran);
  }
 
 public void afficher()  {
  super.afficher();
  System.out.println("Largeur du rectangle : " + largeur);
  System.out.println("Hauteur du rectangle : " + hauteur);
 }
    @Override
    public String toString() {
        return " Rectangle " + largeur;
    }
 

} // Fin de la classe Ellipse