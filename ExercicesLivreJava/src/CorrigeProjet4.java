import java.util.Scanner;

public class CorrigeProjet4 {

    public static void main(String[] args) {
                byte choix;
                char typeCpte ='\0';
                double val_courante = 0.0, taux = 0.0;
                long numeroCpte = 0, numeroLu = 0 ;
                Scanner lectureClavier = new Scanner(System.in);
                do  {
                    System.out.println("1. Cr�ation d'un compte");
                    System.out.println("2. Affichage d'un compte");
                    System.out.println("3. Ecrire une ligne comptable");
                    System.out.println("4. Sortir");
                    System.out.println("5. De l'aide");
                    System.out.println();
                    System.out.print("Votre choix : ");
                    choix = lectureClavier.nextByte();
                    switch (choix)    {
                        case 1 :
                            do   {
                                System.out.print("Type du compte [Types possibles :" );
                                System.out.print("C(ourant), J(oint), E(pargne)] :");
                                typeCpte = lectureClavier.next().charAt(0);
                            } while ( typeCpte != 'C' && typeCpte != 'J' && typeCpte != 'E');
                            System.out.print("Numero du compte : ");
                            numeroCpte = lectureClavier.nextLong();
                            System.out.print("Premiere valeur creditee : ");
                            val_courante = lectureClavier.nextDouble();
                            if ( typeCpte == 'E')     {
                                System.out.println("Taux de placement :     ");
                                taux = lectureClavier.nextDouble();
                            }
                            break;
                        case 2 :
                            System.out.print ( " Quel compte souhaitez vous afficher ? : ");
                            numeroLu = lectureClavier.nextLong();
                            // v�rifie que le num�ro du compte existe, 
                            if ( numeroLu == numeroCpte){
                            System.out.print("Le compte n� : " + numeroCpte + " est un compte ");
                            if (typeCpte == 'C') System.out.println(" courant  ");
                            else if (typeCpte == 'J') System.out.println(" joint  ");
                            else if (typeCpte == 'E')
                                System.out.println(" epargne  dont le taux est  " + taux);
                            System.out.println(" Valeur initiale : " + val_courante);
                        }
                        System.out.println("Le systeme ne connait pas le compte " + numeroLu);
                        break;
                        case 3 :
                            //option 3, le programme affiche "option non programm�e"
                            System.out.println("Option non programm�e");
                            break;
                        case 4 :
                            //option 4,  le programme termine son ex�cution
                            System.out.println("Au revoir et � bient�t");
                            System.exit(0) ;
                            break;
                        case 5 :
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
                            break;
                        default :
                            System.out.println("Cette option n'existe pas ");
                    }
                } while (choix != 4);
            }
        }

