 package exercises;
 import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a grade: ");
		grade = sc.nextInt();
		switch (grade) {
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
				System.out.println("Grade is not valid.");
		}
		sc.close();
	}
}
