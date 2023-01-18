package loop;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 1 ;
		int b = 0 ;
		for(int i =1 ; i<=n ;i++) {
			int c = a+b ;
			a = b ;
			b = c ;
			System.out.println(c);
			
		}

	}

}
