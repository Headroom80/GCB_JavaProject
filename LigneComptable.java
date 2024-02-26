import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LigneComptable {
    public LocalDate date;
    public String reference;
    public long cpteDebite;
    public long cpteCredite;
    public double montant;

    public void CreerLigneComptable(Scanner lectureClavier){
        String dateNoFomat;
        System.out.println("entrez la date de la transaction (format DD/MM/YYYY) : ");
        dateNoFomat = lectureClavier.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{
            date = LocalDate.parse(dateNoFomat,formatter);
        }catch (DateTimeException e){
            System.out.println("Format  de date non valide");
        }
        System.out.println(" Entrez le num du compte à Débiter :  ");
        cpteDebite = lectureClavier.nextLong();


        do{
            System.out.println("Entrez le montant de la transaction : ");
            montant = lectureClavier.nextDouble();
            if(montant > cpteDebite){
                System.out.println("Transaction non authorisé, solde insuffisant");
            }
        }while(montant>cpteDebite);

        System.out.println("Entrez le numero de compte a crédité : ");
        cpteCredite = lectureClavier.nextLong();
        System.out.println("Transaction effectuer avec succés :");
        System.out.println("Date : " + date);
        System.out.println("numero de compte débité :"+ " "+ cpteDebite );
        System.out.println("numero de compte crédité :"+ " "+ cpteCredite );
        reference = getReference();
        System.out.println("Reference  : " + reference);
    }

    public String getReference(){
        String referenceCpteDeb = Long.toString(cpteDebite);
        referenceCpteDeb = referenceCpteDeb.length() > 2 ? referenceCpteDeb.substring(0,2) : referenceCpteDeb;
        String referenceCpteCred = Long.toString(cpteCredite % 100);
        return referenceCpteCred + referenceCpteDeb;
    }

}
