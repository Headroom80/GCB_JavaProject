public class Function {
    public static void main(String[] args) {
        int nbCb = 25, nbPayments = 100;
        System.out.println(moyenne(nbCb,nbPayments));

    }
    public static float moyenne(int cb,int nbPay){
        float moyPay = ((float) cb / nbPay) * 100;
        return moyPay;
    }
}
