package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		String drivingLicense;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your driving license category: ");
		drivingLicense = sc.next();
		switch (drivingLicense) {
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
			}
		}
		sc.close();
	}
}