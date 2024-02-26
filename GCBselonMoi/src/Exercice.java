import  java.util.*;
public class Exercice {

    public static void main(String[] args) {
        runScript();
    }

    public static void runScript(){
            String[] menus = {"Creer un compte", "Afficher un compte", "Creer une ligne comptable", "Sortir", "De l'aide"};
            int userResponse;
            String[] menuCompte = {"Type de compte : Types possibles : courant, joint, épargnes : ", "Numero de compte : ", "Première valeur créditer : ", "Taux de placement : "};
        String[] menuAide = {"Appuyer sur 1 pour creer un compte bancaire.", "Appuyer sur 2 pour saisir un numero de compte et le consulter", "l'option numéro 3 est temporairement indisponible",
                "appuyer sur 4 pour arreter le programme"};
            Boolean continu = true;
            int accountNumb;
            Scanner lectureClavier = new Scanner(System.in);
            while (continu) {
                System.out.println("Choisissez un menu : ");
                for (int i = 0; i < menus.length; i++) {
                    System.out.println((i + 1) + " : " + menus[i]);
                }
                userResponse = lectureClavier.nextInt();
                switch (userResponse) {
                    case 1:
                        clearConsole();
                        for (int i = 0; i < menuCompte.length; i++) {
                            System.out.println((i + 1) + " : " + menuCompte[i]);
                        }
                        retour();
                        if (lectureClavier.next() == "b") {
                            continu = false;
                        }
                        break;
                    case 2:
                        clearConsole();
                        System.out.println("Saisissez un numéro de compte pour le consulter : ");
                        accountNumb = lectureClavier.nextInt();
                        System.out.println("Vous êtes actuellement sur le compte numéro : " + accountNumb);
                        retour();
                        if (lectureClavier.next() == "b") {
                            continu = false;
                        }
                        break;
                     case 3:
                         clearConsole();
                         System.out.println("option non programmée");
                         retour();
                         if (lectureClavier.next() == "b") {
                             continu = false;
                            }
                            break;
                    case 4 :
                        System.out.println("le programme va s'arreter dans 2 sec , aurevoir.");
                        System.exit(0);
                        break;
                    case 5 :
                        clearConsole();
                        for (int i = 0; i < menuAide.length ; i ++ ){
                            System.out.println((i + 1 ) + " : " + menuAide[i]);
                        }
                        retour();
                        if (lectureClavier.next() == "b") {
                            continu = false;
                        }
                        break;


                }

            }
            if(!continu){
                runScript();
            }
        }
    public static void clearConsole() {
        for(int i = 0;i <19;i++){
            System.out.println("\n");
        }
    }

    public static void retour() {
        System.out.println("Appuyez sur 'b' pour retourner au menu principal");
    }
}

