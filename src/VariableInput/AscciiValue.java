package VariableInput;
import java.util.*;
public class AscciiValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the char");
		char ch = sc.next().charAt(0);
		int assciiVal = ch;
		System.out.println("the AsscIIvalue of this char " + assciiVal);

	}

}
