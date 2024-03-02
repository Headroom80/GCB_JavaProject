/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 10 - 11 : Fichiers communs au projet
#	Section  : Projet
#	Fichier  : Compte.java
#	Class    : Compte
*/
import java.util.*;
import java.io.*;
public class Compte implements Serializable	{
 private String typeCpte ;
 protected double val_courante;
 private String numeroCpte ;
 private LigneComptable []ligne;
 public static final int NBLigne = 10 ;
 private int nbLigneReel ;  
 public Compte () 	{ 
        Scanner lectureClavier = new Scanner(System.in);
	typeCpte = contreleType();
	System.out.print("Numero du compte : ");
	numeroCpte = lectureClavier.next();
	val_courante = contreleValinit();  
	ligne = new LigneComptable[NBLigne];
	nbLigneReel = -1;
 }

 public  Compte( String type)  {
        Scanner lectureClavier = new Scanner(System.in);
	if (type.equalsIgnoreCase("Epargne")) {
		typeCpte = type;
		System.out.print("Numero du compte : ");
		numeroCpte = lectureClavier.next();
		val_courante = contreleValinit();   
		ligne = new LigneComptable[NBLigne];
		nbLigneReel = -1;
   	}
 }
 public LigneComptable quelleLigne(int n)	{
		return ligne[n];
 }
	
 public int combienLignes() {
		return nbLigneReel;
 }

 public String quelTypeDeCompte() 	{
		return typeCpte;
 }
 public String quelNumeroDeCompte()	{
		return numeroCpte;
 }
 public double quelleValeurCourante()	{
		return val_courante;
 }
 private String contreleType()		{
                Scanner lectureClavier = new Scanner(System.in);
		char tmpc;
		String tmpS = "";
		do {
				System.out.print("Type du compte [Types possibles :" ); 
				System.out.print("C(ourant), J(oint)] : ");
				tmpc = lectureClavier.next().charAt(0);
		} while ( tmpc != 'C' && tmpc != 'J' );
		switch (tmpc) {
			case 'C' : tmpS = "Courant";
			break;
			case 'J' : tmpS = "Joint";
			break;
		}
		return tmpS;
 }
 private double contreleValinit()	 {
                Scanner lectureClavier = new Scanner(System.in);
		double tmp, tmpval;
		do {
			System.out.print("Valeur initiale du compte : ");
			tmpval= lectureClavier.nextDouble();  
		} while ( tmpval <= 0);
		return tmpval;
 }
 public void creerLigne() {
		nbLigneReel++;
		if (nbLigneReel < NBLigne) 
			ligne [nbLigneReel] = new LigneComptable();
		else {
			nbLigneReel--;
			decalerLesLignes();
			ligne [nbLigneReel] = new LigneComptable();
		}
		val_courante = val_courante + ligne[nbLigneReel].quelleValeur();
 }
 private void decalerLesLignes() {
		for(int i = 1; i < NBLigne ; i++)
		ligne[i-1] = ligne[i];
 }
 public  void afficherCpte() {
		System.out.print("Le compte ne : " + numeroCpte );
		System.out.println(" est un compte "+typeCpte);
		if (nbLigneReel >=0) {
			for (int i = 0; i <= nbLigneReel; i++) ligne[i].afficherLigne();
		}
		System.out.println("Valeur courante : " + val_courante);
		if (val_courante < 0) System.out.println("Attention compte debiteur ... !!!");
 }
}