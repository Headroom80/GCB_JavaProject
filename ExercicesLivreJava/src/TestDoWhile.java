import java.util.Scanner;


public class TestDoWhile {
    static char typeCpte ='\0';
    static long numeroCpte = 0;
    static double val_courante = 0.0, taux = 0.0;
    static Scanner lectureClavier = new Scanner(System.in);
    public static void main(String[] args) {
        byte choix;
        do {
           choix = menuPrincipal();
            switch (choix){
                case 1 :
                    creerCpte(TestDoWhile.lectureClavier);
                break;
                case 2 :
                    afficherCpte(TestDoWhile.typeCpte,TestDoWhile.numeroCpte,TestDoWhile.taux,TestDoWhile.val_courante);
                    break;
                case 3 :
                    System.out.println("Option non programmée");
                    break;
                case 4 :
                    sortir();
                    break;
                case 5 :
                    aLaide();
            }
        } while(choix != 4);
        System.out.println("Au revoir et à bient0t");
        System.exit(0) ;
    }
    public static byte menuPrincipal(){
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
    public  static void aLaide(){
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
    public static void sortir(){
        System.out.println(" Aurevoir et à bientôt ");
        System.exit(0);
    }
    public static void afficherCpte(char type,long numeroDuCompte,double tauxEpargne, double solde){

            if (type == 'E') {
                System.out.println("compte épargne n° " + numeroDuCompte + " ,taux de placement est de" + tauxEpargne + " %");
                System.out.println(" votre solde est de : " + solde + " €");
            } else if (type == 'C') {
                System.out.println(" compte courant n° " + numeroDuCompte + " solde : " + solde + " €");
            } else if (type == 'J') {
                System.out.println(" Compte joint n° " + numeroDuCompte + " solde : " + solde + " €");
            } else {
            System.out.println(" votre compte n'est pas  reconnu par le system ");
        }

    }
    public static void creerCpte (Scanner lectureClavier){

        do{
            System.out.print("Type du compte [Types possibles :" );
            System.out.print("C(ourant), J(oint), E(pargne)] :");
            TestDoWhile.typeCpte = lectureClavier.next().charAt(0);
        }while(TestDoWhile.typeCpte != 'C' && TestDoWhile.typeCpte != 'J' && TestDoWhile.typeCpte != 'E');
        System.out.println("Numero de compte : ");
        TestDoWhile.numeroCpte = lectureClavier.nextLong();
        System.out.println(" Premiere valeurs créditée");
        TestDoWhile.val_courante = lectureClavier.nextDouble();
        if ( TestDoWhile.typeCpte == 'E'){
            System.out.println(" Taux de placement : ");
            TestDoWhile.taux = lectureClavier.nextDouble();
        }
    }
}
