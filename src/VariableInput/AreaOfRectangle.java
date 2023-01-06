package VariableInput;
import java.util.*;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length: ");
		int l = sc.nextInt();
		System.out.println("enter the breadth: ");
		int b = sc.nextInt();
		int area = l*b;
		System.out.println("the area of rectangle is: " + area);
		

	}

}
