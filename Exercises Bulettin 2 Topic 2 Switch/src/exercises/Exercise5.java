package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		String drivingLicense; //Declaration of variable
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Insert your driving license category: "); //The program asks the user for specific category.
		drivingLicense = sc.next(); //User input
		switch (drivingLicense) { //Switch block begins.
			case "B1" -> {
				System.out.println("Cars");
			}
			case "B2" -> {
				System.out.println("Cars");
			}
			case "A" -> {
				System.out.println("Motorcycles");
			}
			case "C1" -> {
				System.out.println("Trucks");
			}
			case "C5" -> {
				System.out.println("Trucks");
			}
			case "D" -> {
				System.out.println("Buses");
			}
			case "E" -> {
				System.out.println("Trailers");
			}
			default -> {
				System.out.println("You haven´t inserted a driving license category. Please execute and try again.");
			} //If an incorrect string or value is inserted, an error message will pop up.
		}
		sc.close(); //Closing scanner
	}
}