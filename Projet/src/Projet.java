import java.util.Scanner;

public class Projet {


    public static void main(String[] args) {
        Compte instanceCpte = new Compte();
        Scanner lectureClavier = new Scanner(System.in);
        LigneComptable instanceLc = new LigneComptable();

        byte choix;
        do {
            choix = menuPrincipal();
            switch (choix) {
                case 1:
                    instanceCpte.creerCpte(lectureClavier);
                    break;
                case 2:
                    instanceCpte.AfficherCpte();
                    break;
                case 3:
                    instanceLc.CreerLigneComptable(lectureClavier);
                    if(instanceCpte.quelNumerodeCompte().equals(instanceLc.getCpteDebite())){
                        instanceCpte.-= instanceLc.montant;
                    }
                    break;
                case 4:
                    sortir();
                    break;
                case 5:
                    aLaide();
            }
        } while (choix != 4);
        System.out.println("Au revoir et à bient0t");
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

}
