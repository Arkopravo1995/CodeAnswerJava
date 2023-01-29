package conditionals;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner inp  = new Scanner(System.in);
		System.out.println("enter your sign: ");
		char sign = inp.next().charAt(0);
		//sign  =  opera
		System.out.println("enter number :");
		int num1 = inp.nextInt();
		System.out.println("enter number :");
		int num2 = inp.nextInt();
		sign = '*';
		switch(sign){
			case '+':
				System.out.println(num1+num2);
				break;
			case '-':
				System.out.println(num1-num2);
				break;
			case '*':
				System.out.println(num1*num2);
				break;
			case '/':
				System.out.println(num1/num2);
			default:
				System.out.println("invalid choice");
		}

	}

}
