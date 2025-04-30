import java.util.Scanner;

public class Pi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(pi(n));
    }
    
    public static double pi(int n) {
        if (n < 0) {
            return 0.0;
        }
        if (n == 0) {
            return 4.0; 
        }
        
        double term = Math.pow(-1, n) * (4.0 / (2 * n + 1));
        return term + pi(n - 1);
    }
}