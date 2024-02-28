import java.util.Scanner;

public class Etudiant {
    private String nom,prenom;
    double [] notes,moyenne;

    public Etudiant() {
        var lectureClavier = new Scanner(System.in);
        System.out.println("Entrez le nom de l'étudiant : ");
        nom = lectureClavier.next();
        System.out.println("Entrez le prenom de l'étudiant : ");
        prenom = lectureClavier.next();
        System.out.println("Combien de notes pour l'étudiant :");
        System.out.println(nom + " " + prenom + " " + " : ");
        var nombre = lectureClavier.nextInt();
        notes = new double[nombre];
        for (var i = 0; i < notes.length; i++) {
            System.out.println("Entrez la notes n°" + (i + 1) + " : ");
            notes[i] = lectureClavier.nextDouble();
        }
    }

       private double calculMoyenne() {

            var somme = 0.0;
            for (double  note : notes) somme = somme + note;
            return somme / notes.length;
            }


    }
