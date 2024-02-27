import java.util.Scanner;

public class Compte {
    private char type;
    private String typeCpte="";
    private String numeroCpte = "";

    public void setVal_courante(double val_courante) {
        this.val_courante = val_courante;
    }

    private double val_courante, taux = 0.0;

    public String quelNumerodeCompte(){
        return numeroCpte;
    }
    public  double quelValeurCourante(){
        return val_courante;
    }

    public void creerCpte(Scanner lectureClavier) {

        do {
            System.out.print("Type du compte [Types possibles :");
            System.out.print("(C)ourant), (J)oint), E(pargne)] :");
            type = lectureClavier.next().toUpperCase().charAt(0);
            switch (type) {
                case 'C':
                    typeCpte = "courant";
                    break;
                case 'J':
                    typeCpte = "joint";
                    break;
                case 'E':
                    typeCpte = "epargne";
                    break;
            }

        } while (!typeCpte.contains("joint") && !typeCpte.contains("courant") && !typeCpte.contains("epargne"));
        lectureClavier.nextLine();
        System.out.println("Numero de compte : ");
        numeroCpte = lectureClavier.nextLine();
        System.out.println(" Premiere valeurs créditée");
        val_courante = lectureClavier.nextDouble();
        if (typeCpte.contains("epargne")) {
            System.out.println(" Taux de placement : ");
            taux = lectureClavier.nextDouble();
        }
    }
    public void AfficherCpte(){
        if (typeCpte.contains("epargne")) {
            System.out.println("compte épargne n° " + numeroCpte + " ,taux de placement est de" + taux + " %");
            System.out.println(" votre solde est de : " + val_courante + " €");
        } else if (type == 'C') {
            System.out.println(" compte courant n° " + numeroCpte + " solde : " + val_courante + " €");
        } else if (type == 'J') {
            System.out.println(" Compte joint n° " + numeroCpte + " solde : " + val_courante + " €");
        } else {
            System.out.println(" votre compte n'est pas  reconnu par le system ");
        }
    }
/*    private String controleType(){
        char tmpc;
        String tmps = "Courant";
        Scanner lectureClavier = new Scanner(System.in);

        do {
            System.out.println("Type du compte possible : C(ourant), J(oint), E(pargne)  : ");
            tmpc = lectureClavier.next().charAt(0);

        }while (tmpc != 'C' && tmpc != 'J' && tmpc != 'E');
        switch (tmpc) {
            case'C': tmps = "Courant";
                    break;
            case'J':tmps = "Joint";
                    break;
            case 'E': tmps = "Epargne";
                    break;

        }
        return tmps;
        }*/
    }
