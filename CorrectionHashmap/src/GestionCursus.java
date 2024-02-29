/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indetermine d'objets 
#	Exercice   : 10.9
#	Fichier    : GestionCursus.java
#	Class      : GestionCursus
*/
import java.util.*;
import java.io.*;
public class GestionCursus  {
 public static void main (String [] argument) throws IOException, ClassNotFoundException {
	byte choix = 0 ;
	Cursus C = new Cursus();
	FichierEtudiant F = new FichierEtudiant();
        Scanner lectureClavier = new Scanner(System.in);
 	if (F.ouvrir("L")) {
 		C = F.lire();
 		F.fermer();
 	}
	

	String prenom, nom;
	do {
	  choix = menuPrincipal();
	  switch (choix) {
		case 1 :		
            C.ajouteUnEtudiant();
		    break;
		case 2 :
			System.out.print("Entrer le prenom de l'etudiant a supprimer ");
			prenom = lectureClavier.next();
			System.out.print("Entrer le nom de l'etudiant a supprimer ");
			nom = lectureClavier.next();
			C.supprimeUnEtudiant(prenom, nom);
		    break;
		case 3 :		
            C.afficheLesEtudiants(); 
            break;
		case 4 :
			System.out.print("Entrer le prenom de l'etudiant recherche ");
			prenom = lectureClavier.next();
			System.out.print("Entrer le nom de l'etudiant recherche ");
			nom = lectureClavier.next();
			C.rechercheUnEtudiant(prenom, nom);
		break;
		case 5 : //option 5,  le programme termine son execution
			System.out.println("Sauvegarde des donnees dans Cursus.dat");	
			F.ouvrir("Ecriture"); 
			F.ecrire(C);
			F.fermer();
			sortir();    
		break;
		default : System.out.println("Cette option n'existe pas ");
	 }
  } while (choix != 5);
 }
 public static byte menuPrincipal() {
	byte tmp;
        Scanner lectureClavier = new Scanner(System.in);
	System.out.println("1. Ajoute un etudiant");
	System.out.println("2. Supprime un etudiant");
	System.out.println("3. Affiche la liste des etudiant");
	System.out.println("4. Affiche un etudiant");
	System.out.println("5. Sortir");
	System.out.println();
	System.out.print("Votre choix : ");
	tmp  = lectureClavier.nextByte();
	return tmp;
 }
 public static void sortir( ) {
	System.out.println("Au revoir et à bientôt");
	System.exit(0) ;
 }
}