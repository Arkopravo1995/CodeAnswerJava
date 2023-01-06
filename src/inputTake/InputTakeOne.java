package inputTake;
import java.util.*;
public class InputTakeOne {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String name = inp.next();
		int rollnum = inp.nextInt();
		String interest = inp.next();
		System.out.println("Name : "+ name);
		System.out.println("Roll Number : " + rollnum);
		System.out.println("Field of Interest : " + interest);
		
	}

}
