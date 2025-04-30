public class P_G{
    public static void main(String[] args) {
        int n = 11;
        System.out.println(calculaSoma(n));
    }

    static double calculaSoma(int n) {
        double s = 0;
        for (int i = 2; i <= n; i++)
            if (ehPrimo(i)) s += 1.0/i;
        return s;
    }

    static boolean ehPrimo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return n > 1;
    }
}