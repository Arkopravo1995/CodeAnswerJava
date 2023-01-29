package conditionals;
import java.util.*;
public class ProfitLoss {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("enter the costprice : ");
		
		int val1 = inp.nextInt();
		int cp = val1;
		System.out.println("enter the Sellingprice : ");
		int val2 = inp.nextInt();
		int sp = val2;
		int price ;
		if(sp > cp) {
			price = sp - cp;
			System.out.println("profit = " +price);
			
		}
		else {
			price = cp -sp;
			System.out.println("Loss = " +price);
		}
		

	}

}
