 package exercises;
 import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int grade; //Declaration of variable
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Type in a grade: "); //The program asks for input.
		grade = sc.nextInt(); //User input
		switch (grade) { //Switch block begins.
			case 0,1,2,3,4:
				System.out.println("UNSATISFACTORY");
				break;
			case 5:
				System.out.println("SATISFACTORY");
				break;
			case 6:
				System.out.println("GOOD");
				break;
			case 7,8:
				System.out.println("GREAT");
				break;
			case 9,10:
				System.out.println("EXCELLENT");
				break;
			default:
				System.out.println("Grade is not valid."); //Incorrect grade input
		}
		sc.close(); //Closing scanner
	}
}
