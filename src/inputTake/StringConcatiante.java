package inputTake;
import java.util.*;
public class StringConcatiante {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		while(scn.hasNextLine()) {
			String inp1 = scn.next();
			String inp2 = scn.next();
			System.out.println(inp1+inp2);
		}

	}

}
