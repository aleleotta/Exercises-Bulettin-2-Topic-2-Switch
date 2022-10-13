package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		String firstDice, secondDice; //Declaration of variables 
		int firstDice1, secondDice2, result; //Declaration of auxiliars and result
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Roll the dices."); //The program asks for input.
		System.out.println("What number did the first dice get: "); //First number
		firstDice = sc.next(); //User input
		System.out.println("What number did the second dice get: "); //Second number
		secondDice = sc.next(); //User input
		firstDice1 = switch (firstDice) { //First switch block begins
			case "ONE" -> { //The string value will be converted to an integer by using the strings as cases and then assigning integers into the auxiliars.
				yield 1;
			}
			case "TWO" -> {
				yield 2;
			}
			case "THREE" -> {
				yield 3;
			}
			case "FOUR" -> {
				yield 4;
			}
			case "FIVE" -> {
				yield 5;
			}
			case "SIX" -> {
				yield 6;
			}
			default -> {
				System.out.println("ERROR!");
				yield -1;
			}
		};
		secondDice2 = switch (secondDice) { //Second switch block begins.
			case "ONE" -> { //The string value will be converted to an integer by using the strings as cases and then assigning integers into the auxiliars.
				yield 1;
			}
			case "TWO" -> {
				yield 2;
			}
			case "THREE" -> {
				yield 3;
			}
			case "FOUR" -> {
				yield 4;
			}
			case "FIVE" -> {
				yield 5;
			}
			case "SIX" -> {
				yield 6;
			}
			default -> {
				System.out.println("ERROR!");
				yield -1;
			}
		};
		result = firstDice1 + secondDice2; //Calculation of both integers.
		System.out.println("The result for both dice numbers is: " + result); //Result is printed out.
		System.out.println("");
		System.out.println("Have a nice day!");
		sc.close(); //Closing scanner
	}
}