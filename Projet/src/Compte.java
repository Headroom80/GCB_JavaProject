import java.io.Serializable;
import java.util.Scanner;

public class Compte  implements Serializable {
    private String type;
    private String typeCpte="";
    private String numeroCpte = "";
    public LigneComptable [] lignes;
    public static final int NBLigne = 10;
    public int nbReelLigne;
    public double getVal_courante(){
        return val_courante;
    }

    public void setVal_courante(double val_courante) {
        this.val_courante = val_courante;
    }

    private double val_courante;

    public String quelNumerodeCompte(){
        return numeroCpte;
    }
    public  double quelValeurCourante(){
        return val_courante;
    }

    public  Compte() {
        Scanner lectureClavier = new Scanner(System.in);
        type = controleType();
        System.out.println("Numero de compte : ");
        numeroCpte = lectureClavier.nextLine();
        System.out.println(" Premiere valeurs créditée");
        val_courante = lectureClavier.nextDouble();
        lignes = new LigneComptable[NBLigne];
        nbReelLigne = -1;
    }
    public  Compte( String type)  {
        Scanner lectureClavier = new Scanner(System.in);
        if (type.equalsIgnoreCase("Epargne")) {
            typeCpte = type;
            System.out.print("Numero du compte : ");
            numeroCpte = lectureClavier.next();
            val_courante = controleValinit();
            lignes = new LigneComptable[NBLigne];
            nbReelLigne = -1;
        }
    }

    public void AfficherCpte(){
        if (typeCpte.contains("Epargne")) {
            System.out.println("compte épargne n° " + numeroCpte + " ,taux de placement est de" + " %");
            System.out.println(" votre solde est de : " + val_courante + " €");
            System.out.println("Vos dernieres transaction : ");
        } else if (type.equalsIgnoreCase("Courant")) {
            System.out.println(" compte courant n° " + numeroCpte + " solde : " + val_courante + " €");
        } else if (type.equalsIgnoreCase("Joint") ) {
            System.out.println(" Compte joint n° " + numeroCpte + " solde : " + val_courante + " €");
        } else {
            System.out.println(" votre compte n'est pas  reconnu par le system ");
        }
        System.out.println("Vos dernieres transactions : ");
        if(nbReelLigne >= 0){
            for( var i = 0 ; i <= nbReelLigne; i++){
                System.out.println(lignes[i]);
            }
        }
    }
    public void creerLigne(){
        nbReelLigne++;
        if (nbReelLigne < NBLigne)
            lignes[nbReelLigne] = new LigneComptable();
        else {
            nbReelLigne--;
            decalerLesLignes();
            lignes[nbReelLigne] = new LigneComptable();
        }
        val_courante = val_courante + lignes[nbReelLigne].getMontant();
    }
    private void decalerLesLignes() {
        for(int i = 1; i < NBLigne ; i++)
            lignes[i-1] = lignes[i];
    }
    private String controleType()		{
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
    private double controleValinit()	 {
        Scanner lectureClavier = new Scanner(System.in);
        double tmp, tmpval;
        do {
            System.out.print("Valeur initiale du compte : ");
            tmpval= lectureClavier.nextDouble();
        } while ( tmpval <= 0);
        return tmpval;
    }
    }
