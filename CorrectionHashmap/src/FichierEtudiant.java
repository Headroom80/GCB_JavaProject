/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indetermine d'objets 
#	Exercice   : 10.9
#	Fichier    : FichierEtudiant.java
#	Class      : FichierEtudiant
*/

import java.io.*;
public class FichierEtudiant  {
  private  String nomDuFichier = "Cursus.dat";
  private   ObjectOutputStream fWo;
  private   ObjectInputStream fRo;
  private char mode;
	
  public boolean ouvrir(String s) {
   try {
   	mode = (s.toUpperCase()).charAt(0);
  		if (mode == 'R' || mode == 'L') 
   		fRo  = new ObjectInputStream(new FileInputStream(nomDuFichier));
  		else 	if (mode == 'W' || mode == 'E') 
    		fWo  = new ObjectOutputStream(new FileOutputStream(nomDuFichier));
   	return true;
   }
   catch (IOException e)	{
   	return false;
  }
 }  
 public void fermer() {
  try   {
	  if (mode == 'R' || mode == 'L') fRo.close();
 	  else	if (mode == 'W' || mode == 'E')  fWo.close();
  }
  catch (IOException e)  {
   System.out.println(nomDuFichier+" : Erreur à la fermeture "); 
  }
 }
 public Cursus lire() {
   try {
   	Cursus tmp = (Cursus) fRo.readObject();
     return tmp;
   }
   catch (IOException e) { 
       System.out.println(nomDuFichier+" : Erreur  de lecture "); 
   }
   catch (ClassNotFoundException e) { 
       System.out.println(nomDuFichier+" n'est pas du bon format "); 
   }
   return null;
 }
 public void ecrire(Cursus tmp) {
  try {
    if (tmp != null)  fWo.writeObject(tmp);
  }
  catch (IOException e) {  
    System.out.println(nomDuFichier+" : Erreur en cours d'ecriture "+e); 
  }
 }
}