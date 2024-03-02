import java.util.Scanner;

public class Projet {
    public static void main(String[] args) {
        ListeCompte instanceListe = new ListeCompte();
        Scanner lectureClavier = new Scanner(System.in);
        String numeroLu = "";
        FichierCompte fichier = new FichierCompte();
        if (fichier.ouvrir("L")) {
            instanceListe = fichier.lire();
            fichier.fermer();
        }
        if (instanceListe == null) {
            instanceListe = new ListeCompte();
        }

        byte choix;
        do {
            choix = menuPrincipal();
            switch (choix) {
                case 1:
                    System.out.print (" Compte Epargne (o/n) : ");
                    if (lectureClavier.next().charAt(0) == 'o')
                        instanceListe.AjouterUnCompte("E");
                    else
                        instanceListe.AjouterUnCompte("A");
                    break;
                case 2:
                    System.out.println("Quel compte souhaiter vous  afficher ? : ");

                    numeroLu = lectureClavier.next();
                    instanceListe.rechercherUnCompte(numeroLu);
                    break;
                case 3:
                    instanceListe.afficheLesComptes();
                    break;
                case 4:
                    System.out.print ( "Pour quel compte souhaitez vous creer une ligne ? : ");
                    numeroLu = lectureClavier.next();
                    instanceListe.ajouteUneLigne(numeroLu);
                    break;
                case 5:
                    System.out.print ( "Quel compte souhaitez vous supprimer ? : ");
                    numeroLu = lectureClavier.next();
                    instanceListe.supprimeUnCompte(numeroLu);
                    break;
                case 6:
                    System.out.println("Sauvegarde des donnees dans Compte.dat");
                    fichier.ouvrir("E");
                    fichier.ecrire(instanceListe);
                    fichier.fermer();
                    sortir();
                case 7:
                    aLaide();
                    break;
            }
        } while (choix != 6);
        System.out.println("Au revoir et à bientot");
        System.exit(0);
    }

    public static byte menuPrincipal() {
        byte tmp;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("1. Creation d'un compte");
        System.out.println("2. Affichage d'un compte");
        System.out.println("3. Affichage de tous les comptes");
        System.out.println("4. Ecrire une ligne comptable");
        System.out.println("5. Supprimer un compte ");
        System.out.println("6. Sortir");
        System.out.println("7. De l'aide");
        System.out.println();
        System.out.print("Votre choix : ");
        tmp  = lectureClavier.nextByte();
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
