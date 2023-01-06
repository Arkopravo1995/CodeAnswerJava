package VariableInput;
import java.util.*;
public class Variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number1: ");
		int num1 = sc.nextInt();
		System.out.println("enter the num2: ");
		int num2 = sc.nextInt();
		int product = num1*num2;
		System.out.println("the product of num1 and num2 is : " + product);
		
	}

}
