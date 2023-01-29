package conditionals;
import java.util.*;
public class NumberChecked {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("enter the number : ");
		int number  = inp.nextInt();
		if(number > 0) {
			System.out.println("its the number : " + number);
			
		}else {
			System.out.println("This is a negetive number & skipped" );
		}

	}

}
