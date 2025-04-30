import java.util.Arrays;

public class Fatorial{
	public static void main(String[] args) {

			System.out.println(fatorial(8));
	}
	public static int fatorial(int n){
	    int fat = 1;
			while(n > 1){
				fat = fat*n;
				n = n-1;
			}
			return fat;
	}
}
 
