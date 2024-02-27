import java.util.Scanner;

public class Lire {
    private static Scanner scanner = new Scanner(System.in);

    public static String S() {
        return scanner.nextLine();
    }

    public static int i() {
        return scanner.nextInt();
    }

    // Et pour lire un flottant
    public static double d() {
        return scanner.nextDouble();
    }
}
