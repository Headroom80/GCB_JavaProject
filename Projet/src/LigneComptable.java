import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LigneComptable {
    private LocalDate date;
    protected String cpteDebite;
    private String cpteCredite;
    private String mode;
    protected double montant;
    private String motif;

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }





    public String getCpteDebite() {
        return cpteDebite;
    }

    public void setCpteDebite(String cpteDebite) {
        this.cpteDebite = cpteDebite;
    }

    public String getCpteCredite() {
        return cpteCredite;
    }

    public void setCpteCredite(String cpteCredite) {
        this.cpteCredite = cpteCredite;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LigneComptable () {
        Scanner lectureClavier = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean dateValide = false;
        char tmpc;

        while (!dateValide) {
            System.out.println("entrez la date de la transaction (format DD/MM/YYYY) : ");
            String dateNoFormat = lectureClavier.next();

            try {
                date = LocalDate.parse(dateNoFormat, formatter);
                dateValide = true;
            } catch (DateTimeException e) {
                System.out.println("Format de date non valide, veuillez réessayer.");
            }
        }
//        do {
            System.out.println("Entrez le montant de la transaction : ");
            montant = lectureClavier.nextDouble();
//            if (montant > compte.quelValeurCourante()) {
//                System.out.println("Transaction non autorisée, solde insuffisant");
//            }
//        } while (montant > compte.quelValeurCourante());
        mode = controleMode();
        motif = controleMotif();
        System.out.println("Transaction effectuée avec succès :");
        System.out.println("Vous avez effectuer une transaction depuis le compte n° :");
        System.out.println("le : " + date);
    }
    private String controleMode(){
        Scanner lectureClavier = new Scanner(System.in);
        char tmpC;
        String tmpS="";
        do {
        System.out.println("Veuillez selectioné le mode de paiement : ");
        System.out.println("mode disponible : C(B) , N(cheque), V(irement)");
        tmpC = lectureClavier.next().charAt(0);
            }while(tmpC != 'C' && tmpC !='N' && tmpC !='V');

            switch (tmpC) {
                case 'C':
                    tmpS = "Carte bancaire";
                    System.out.println("vous avez selectioné le mode de paiement :" + tmpS);
                    break;
                case 'N':
                    tmpS = "Cheque";
                    System.out.println("vous avez selectioné le mode de paiement :" + tmpS);
                    break;
                case 'V':
                    tmpS = "Virement bancaire";
                    System.out.println("vous avez selectioné le mode de paiement :" + tmpS);
                    break;
            }

        return tmpS;
    }
    private String controleMotif(){
        Scanner lectureClavier = new Scanner(System.in);
        char tmpC;
        String tmpS="";

        do {
            System.out.print("Motif de l'operation [S(alaire),");
            System.out.print(" L(oyer), A(limenation), D(ivers)] : ");
            tmpC = lectureClavier.next().charAt(0);
        }while(tmpC != 'S' && tmpC !='L' && tmpC !='A' && tmpC != 'D');
            switch (tmpC) {
                case 'S':
                    tmpS = "Salaire";
                    System.out.println("vous avez selectioné le motif  :" + tmpS);
                    break;
                case 'L':
                    tmpS = "Loyer";
                    System.out.println("vous avez selectioné le motif  :" + tmpS);
                    break;
                case 'A':
                    tmpS = "Alimentation";
                    System.out.println("vous avez selectioné le motif  :" + tmpS);
                    break;
                case 'D' :
                    tmpS= "Divers";
                    System.out.println("vous avez selectioné le motif : Divers");
                    break;
            }

        return tmpS;
    }
    public void afficherLignes(){
        System.out.println(this.toString());
        }
    @Override
    public String toString() {
        return "Vous avez effectuer une transaction pour le motif suivant : " + motif +" le : " + date + " "+ "pour un montant de : " + montant + "par : " +" "+ mode;
    }

}
