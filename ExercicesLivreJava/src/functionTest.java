public class functionTest {
    static int valor = 9;
    public static void main(String[] args) {
    int a = 2 , b = 3;
    System.out.println(" a est égale à :" + a + " et b est egale à : " + b );
    System.out.println("si on utilise echanger : ");
    System.out.println(" a est égale à :" + echanger(a,b)+ " et b est egale à : " + echanger(b,a));
    }
    public static int echanger(int a, int b){
        return a = b;
    }

}
