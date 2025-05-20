import java.util.Arrays;

public class MDC{
	public static void main(String[] args) {
	    int mdc = mdc(250, 150);
		System.out.println(mdc);
	}
	public static int mdc(int n, int v[]){
	    if(n%m==0){
			return m;
		} else {
			return mdc(m, n%m);
		}
	}
}
 
