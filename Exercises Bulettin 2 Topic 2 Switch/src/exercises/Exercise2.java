package exercises;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int chosenDay;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a day of the week by typing an integer from 1 to 7. Number: ");
		chosenDay = sc.nextInt();
		switch (chosenDay){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid number.");
		}
		sc.close();
	}
}
