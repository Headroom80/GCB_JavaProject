import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        byte choix;
        char typeCpte ='\0';
        double val_courante = 0.0, taux = 0.0;
        long numeroCpte = 0, numeroLu = 0 ;
        Scanner lectureClavier = new Scanner(System.in);

        do {
           choix = menuPrincipal();
            switch (choix){
                case 1 : do{
                    System.out.print("Type du compte [Types possibles :" );
                    System.out.print("C(ourant), J(oint), E(pargne)] :");
                    typeCpte = lectureClavier.next().charAt(0);
                }while(typeCpte != 'C' && typeCpte != 'J' && typeCpte != 'E');
                System.out.println("Numero de compte : ");
                numeroCpte = lectureClavier.nextLong();
                System.out.println(" Premiere valeurs créditée");
                val_courante = lectureClavier.nextDouble();
                if ( typeCpte == 'E'){
                    System.out.println(" Taux de placement : ");
                    taux = lectureClavier.nextDouble();
                }
                break;
                case 2 :
                    System.out.println(" Entrez votre numero de compte ");
                    numeroLu = lectureClavier.nextLong();
                    if(numeroLu == numeroCpte) {

                        if (typeCpte == 'E') {
                            System.out.println("compte épargne n° " + numeroLu + " ,taux de placement est de" + taux + " %");
                            System.out.println(" votre solde est de : " + val_courante + " €");
                        } else if (typeCpte == 'C') {
                            System.out.println(" compte courant n° " + numeroLu + " solde : " + val_courante + " €");
                        } else if (typeCpte == 'J') {
                            System.out.println(" Compte joint n° " + numeroLu + " solde : " + val_courante + " €");
                        }
                    }else {
                        System.out.println(" votre compte n'est pas  reconnu par le system ");
                    }
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
}
