import java.util.Scanner;

public class Euler{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
		System.out.println(euler(n));
	}
	public static int euler(int n){
	    double e = 1.0;
	    double fat = 1.0;
	    
	    if(n == 1){
	        return 1.0;
	    } else {
	        double fat = factorial(n);
            return euler(n - 1) + 1.0 / fat;
	    }
	    return e;
	}
	
	public static double factorial(int k) {
        if (k == 0 || k == 1) {
            return 1.0;
        } else {
            return k * factorial(k - 1);
        }
    }
}