import java.util.Scanner;

public class CalculJourdeMois {
    public static void main(String[] args) {
        String mois;
        int annee,jour;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("De quel mois s'agit-il ? : ");
        mois = lectureClavier.nextLine();
        System.out.println(" De quelle année  : ");
        annee = lectureClavier.nextInt();
        switch (slugify(mois)){
            case "janvier", "mars", "mai", "juillet", "août", "octobre", "décembre":
                 jour = 31;
                 System.out.println(" le mois : " + mois + " compte : " + jour + " jours.");
                break;
            case "avril", "juin", "septembre", "novembre" :
                jour = 30;
                System.out.println(" le mois : " + mois + " compte : " + jour + " jours.");
                break;
            case "fevrier" :
                if ((annee % 400 == 0) || (annee % 4 == 0) && (annee % 100 != 0)) {
                jour = 29;
                    System.out.println(" le mois : " + mois + " compte : " + jour + " jours.");
                }else{
                    jour = 28;
                    System.out.println(" le mois : " + mois + " compte : " + jour + " jours.");
                }
                break;
            default:
                System.out.println(" Mois invalide");
                break;
        }

    }
    public static String slugify(String str){
        String slug = str.toLowerCase();
        slug = slug.replace("é","e")
                    .replace("è","e")
                    .replace("à","a")
                    .replace("â","a");
        return slug;
    }
}
