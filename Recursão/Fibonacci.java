import java.util.Arrays;

public class Fibonacci{
	public static void main(String[] args) {
	    int n = 8;
	    int v[] = new int[n];
	    fib(n, v);
		System.out.println(Arrays.toString(v));
	}
	public static int fib(int n, int v[]){
	    if(n == 1){
	        return v[n-1] = 0;
	    } else {
	        fib(n-1, v);
	        if(n == 2) {
	            return v[n-1] = 1;
	        } else {
	            return v[n-1] = v[n-2] + v[n-3];
	        }
	    
	   }
	}
}