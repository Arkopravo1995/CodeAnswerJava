package inputTake;
import java.util.*;
public class RetrunSum {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int T = inp.nextInt();
		
		for(int i =1 ;i<=T;i++) {
			int num1 = inp.nextInt();
			int num2 = inp.nextInt();
			int sum = num1+num2;
			System.out.println(sum);
		}
		
	}

}
