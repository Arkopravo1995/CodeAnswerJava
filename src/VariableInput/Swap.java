package VariableInput;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number1: ");
		int number1 = sc.nextInt();
		System.out.println("enter the mumber2 : ");
		int number2 =sc.nextInt();
		int number3 = number1;
		number1 = number2;
		number2 =number3;
		System.out.println("after swap");
		System.out.println("the first number : " +number1);
		System.out.println("the Second number : " +number2);
		
		
	}

}
