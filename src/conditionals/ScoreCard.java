package conditionals;
import java.util.*;
public class ScoreCard {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int number  = inp.nextInt();
		
		if(number >= 90) {
			System.out.println("Your Grade is : " + "A+");
		}
		else if(number >=80) {
			System.out.println("Your Grade is :" + "A");
			
		}
		else if(number >= 70) {
			System.out.println("Your Grade is : " + "B+");
		}
		else if(number >= 60) {
			System.out.println("Your Grade is :" + "B");
			
		}
		else if(number >= 50) {
			System.out.println("Your Grade is: " + "C");
		}
		else if(number >= 40) {
			System.out.println("Your Grade is: " + "D");
			
		}
		else if(number >= 30) {
			System.out.println("Your grade is: "+ "E");
			
		}
		else {
			System.out.println("Your grade is: " + "F");
		}

	}

}
