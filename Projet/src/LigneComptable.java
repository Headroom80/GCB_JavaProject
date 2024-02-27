import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LigneComptable {
    private LocalDate date;
    private String reference;
    protected long cpteDebite;
    private long cpteCredite;
    protected double montant;



    public void setReference(String reference) {
        this.reference = reference;
    }

    public long getCpteDebite() {
        return cpteDebite;
    }

    public void setCpteDebite(long cpteDebite) {
        this.cpteDebite = cpteDebite;
    }

    public long getCpteCredite() {
        return cpteCredite;
    }

    public void setCpteCredite(long cpteCredite) {
        this.cpteCredite = cpteCredite;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void CreerLigneComptable(Scanner lectureClavier) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean dateValide = false;

        while (!dateValide) {
            System.out.println("entrez la date de la transaction (format DD/MM/YYYY) : ");
            String dateNoFormat = lectureClavier.nextLine();

            try {
                date = LocalDate.parse(dateNoFormat, formatter);
                dateValide = true; // Date valide, sortir de la boucle
            } catch (DateTimeException e) {
                System.out.println("Format de date non valide, veuillez réessayer.");
            }
        }

        // Assurez-vous de consommer la ligne entière après avoir lu un long
        System.out.println("Entrez le num du compte à Débiter : ");
        cpteDebite = lectureClavier.nextLong();
        lectureClavier.nextLine(); // Consommer la nouvelle ligne

        do {
            System.out.println("Entrez le montant de la transaction : ");
            montant = lectureClavier.nextDouble();
            lectureClavier.nextLine(); // Consommer la nouvelle ligne
            if (montant > cpteDebite) {
                System.out.println("Transaction non autorisée, solde insuffisant");
            }
        } while (montant > cpteDebite);

        System.out.println("Entrez le numero de compte à créditer : ");
        cpteCredite = lectureClavier.nextLong();
        lectureClavier.nextLine(); // Consommer la nouvelle ligne

        System.out.println("Transaction effectuée avec succès :");
        System.out.println("Vous avez effectuer une transaction depuis le compte n° :");
        System.out.println(cpteDebite);
        System.out.println("vers le compte : ");
        System.out.println(cpteCredite);
        System.out.println("le : " + date);
    }

    public String getReference(){
        String referenceCpteDeb = Long.toString(cpteDebite);
        referenceCpteDeb = referenceCpteDeb.length() > 2 ? referenceCpteDeb.substring(0,2) : referenceCpteDeb;
        String referenceCpteCred = Long.toString(cpteCredite % 100);
        return referenceCpteCred + referenceCpteDeb;
    }

}
