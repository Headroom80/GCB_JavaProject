import java.util.Scanner;

public class Projet {



    public static void main(String[] args) {

        Compte instanceCpte = null;
        Scanner lectureClavier = new Scanner(System.in);
        LigneComptable instanceLc = new LigneComptable();
        String numeroLu = "";

        byte choix;
        do {
            choix = menuPrincipal();
            switch (choix) {
                case 1:
                    instanceCpte = new Compte(lectureClavier);
                    break;
                case 2:
                    System.out.println("Quel compte souhaiter vous  afficher ? : ");

                    numeroLu = lectureClavier.next();

                    assert instanceCpte != null;
                    if (numeroLu.equalsIgnoreCase(instanceCpte.quelNumerodeCompte())){
                        instanceCpte.AfficherCpte();
                    }else{
                        System.out.println("Votre  compte n'est pas reconnu par notre system");
                    }
                    break;
                case 3:
                    System.out.println("Pour quel compte souhaitez vous entrer une nouvelle ligne comptable ? :");
                    numeroLu = lectureClavier.next();
                    if (numeroLu.equalsIgnoreCase(instanceCpte.quelNumerodeCompte())){
                        instanceLc.CreerLigneComptable(lectureClavier,instanceCpte);
                    }else{
                        System.out.println("Veuillez entrer un numéro de compte valide.");
                    }

                    break;
                case 4:
                    sortir();
                    break;
                case 5:
                    aLaide();
            }
        } while (choix != 4);
        System.out.println("Au revoir et à bientot");
        System.exit(0);
    }

    public static byte menuPrincipal() {
        byte tmp;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println(" 1. Création d'un compte");
        System.out.println(" 2. Affichage d'un compte");
        System.out.println(" 3. Ecrire une ligne comptable");
        System.out.println(" 4. Sortir");
        System.out.println(" 5. De l'aide");
        System.out.println();
        System.out.print(" Votre choix : ");
        tmp = lectureClavier.nextByte();
        return tmp;
    }

    public static void aLaide() {
        System.out.println("Option 1. Pour creer un compte Courant entrer C ");
        System.out.println("          Pour creer un compte Joint entrer J ");
        System.out.println("          Pour creer un compte Epargne entrer E");
        System.out.print("          Puis, entrer le numero du compte, et");
        System.out.println(" sa premiere valeur creditee ");
        System.out.println("           Dans le cas d'un compte epargne, entrer le taux ");
        System.out.println("Option 2. Le systeme affiche les donnees du compte choisi ");
        System.out.println("Option 3. Ecrire une ligne comptable");
        System.out.println("Option 4. Pour quitter le programme");
        System.out.println("Option 5. Pour afficher de l'aide");
    }

    public static void sortir() {
        System.out.println(" Aurevoir et à bientôt ");
        System.exit(0);
    }
//    public String ControleType(){
//
//    }
}
