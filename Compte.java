import java.util.Scanner;

public class Compte {
    public char type;
    public String typeCpte="";
    public long numeroCpte = 0;
    public double val_courante = 0.0, taux = 0.0;

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
        System.out.println("Numero de compte : ");
        numeroCpte = lectureClavier.nextLong();
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
}
