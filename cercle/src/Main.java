public class Main {



    public static void main(String[] args) {
        Cercle cercleA =  new Cercle();
        cercleA.creer();
        System.out.println(" nombre de cercles : " + Cercle.nombre);
        cercleA.afficher();

        Cercle cercleB = new Cercle();
        cercleB.creer();
        System.out.println("nombre de cercles : "+ Cercle.nombre);
        cercleB.afficher();

        cercleB.echanger(cercleA);
        System.out.println("aprés échange : ");
        System.out.println("le cercla A :");
        cercleA.afficher();

        System.out.println(" le cercle B : ");
        cercleB.afficher();
    }


}