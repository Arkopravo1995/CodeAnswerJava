package conditionals;
import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the length: ");
		int length = scn.nextInt();
		System.out.println("enter the breadth: ");
		int breadth = scn.nextInt();
		if(length > breadth && breadth<length) {
			System.out.println("its a rectangle");
		}

	}

}
