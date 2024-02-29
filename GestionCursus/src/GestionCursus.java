/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indetermine d'objets 
#	Exercice   : 10.1 
#	Fichier    : GestionCursus.java
#	Class      : GestionCursus
*/

import java.io.IOException;
import java.util.Scanner;

public class GestionCursus  {
	public static void main(String [] argument) throws IOException, ClassNotFoundException {
		byte choix = 0;
		Cursus C = new Cursus();
		Scanner lectureClavier = new Scanner(System.in);
		FichierEtudiant fichierE = new FichierEtudiant();
		if(fichierE.ouvrirFlux("L")) {
			fichierE.lire();
			fichierE.fermer();
		}
        C = fichierE.lire();
		fichierE.fermer();
		String nom,prenom;
		do {
			System.out.println("1. Ajoute un Etudiant");
			System.out.println("2. Supprime un Etudiant");
			System.out.println("3. Affiche la liste des eleves");
			System.out.println("4. Affiche un Etudiant");
			System.out.println("5. Sortir");
			System.out.println();
			System.out.println("Votre choix");
			choix = lectureClavier.nextByte();
			switch(choix){
				case 1:
					C.ajouteUnEtudiant();
					break;
				case 2:
					System.out.println("Entrez un prenom d'étudiant : ");
					prenom = lectureClavier.next();
					System.out.println("Entrez le nom de l'étudiant : ");
					nom = lectureClavier.next();
					C.supprimeUnEtudiant(nom,prenom);
					break;
				case 3:
					C.afficheLesEtudiants();
					break;
				case 4:
					System.out.println("Entrez le prénom de l'étudiant : ");
					prenom = lectureClavier.next();
					System.out.println("Entrez le nom de l'étudiant : ");
					nom =lectureClavier.next();
					C.rechercheUnEtudiant(prenom,nom);
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Cette option n'existe pas");
			}
		}while(choix != 5);
//		System.out.println("------------------  Recapitulatif  ------------------");
//		C.afficheLesEtudiants();
//	//	C.classerParMoyenne();
//		C.ajouteUnEtudiant();
//	//	System.out.println("------------------  Classement  ------------------ ");
//		C.afficheLesEtudiants();
	}
}