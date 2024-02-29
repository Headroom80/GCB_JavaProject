/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indetermine d'objets 
#	Exercice   : 10.1 
#	Fichier    : Etudiant.java
#	Class      : Etudiant
*/
import java.io.Serializable;
import java.util.*;
import java.lang.Number.*;
public class Etudiant implements Serializable {
	private String nom, prenom;
        private ArrayList<Double>  notes; 
	private double moyenne;
	public Etudiant()   	{
        Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrer le nom de l'etudiant : ");
		nom = lectureClavier.next();
		System.out.print("Entrer le prenom de l'etudiant : ");
		prenom = lectureClavier.next();
		System.out.print("Combien de notes pour l'etudiant  ");
		System.out.print( prenom + " " + nom + " :  ");
		int nombre = lectureClavier.nextInt();
		notes = new ArrayList<Double> ();
		for (int i = 0; i < nombre; i ++)	{
			System.out.print("Entrer la note  n� "+ (i+1)+ " :  ");
			notes.add(new Double(lectureClavier.nextDouble()));
		}
		moyenne = calculMoyenne();
	}
	public void afficheUnEtudiant()  {
		System.out.print(" Les notes  de "+prenom+" "+nom+ " sont : ");
		int nbnotes = notes.size();
		for(Double valeur : notes) 
			System.out.print(" "+ valeur);
		System.out.println();
		System.out.println("Sa moyenne vaut  "+ moyenne);
	}

	private double calculMoyenne() 	{ 
		double somme = 0.0;
		int nbnotes = notes.size();
		for(Double valeur : notes) {
			somme = somme + valeur;
		}
		return somme/nbnotes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double quelleMoyenne()	{
		return moyenne;
	}
}