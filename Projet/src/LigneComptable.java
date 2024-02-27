import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LigneComptable {
    private LocalDate date;
    protected String cpteDebite;
    private String cpteCredite;
    protected double montant;



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

    public void CreerLigneComptable(Scanner lectureClavier,Compte compte) {
        double tmp = compte.quelValeurCourante();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean dateValide = false;

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
        do {
            System.out.println("Entrez le montant de la transaction : ");
            montant = lectureClavier.nextDouble();
            if (montant > compte.quelValeurCourante()) {
                System.out.println("Transaction non autorisée, solde insuffisant");
            }
        } while (montant > compte.quelValeurCourante());

        System.out.println("Entrez le numero de compte à créditer : ");
        cpteCredite = lectureClavier.next();
        compte.setVal_courante(tmp-montant);
        System.out.println("Transaction effectuée avec succès :");
        System.out.println("Vous avez effectuer une transaction depuis le compte n° :");
        System.out.println(compte.quelNumerodeCompte());
        System.out.println("vers le compte : ");
        System.out.println(cpteCredite);
        System.out.println("le : " + date);
    }

}
