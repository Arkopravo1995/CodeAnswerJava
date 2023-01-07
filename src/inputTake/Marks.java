package inputTake;
import java.util.*;
public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks1 = sc.nextInt();
		int marks2 = sc.nextInt();
		int marks3 = sc.nextInt();
		int total  = marks1+ marks2+marks3;
		System.out.println("total marks :" +total);
		int percentage = (int) ((total/(300.0))*100);
		System.out.println("percentage of marks: " +percentage + "%");
		
		
		

	}

}
