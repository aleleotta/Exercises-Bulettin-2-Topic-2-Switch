package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		String firstDice, secondDice;
		int firstDice1, secondDice2, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll the dices.");
		System.out.println("What number did the first dice get: ");
		firstDice = sc.next();
		System.out.println("What number did the second dice get: ");
		secondDice = sc.next();
		firstDice1 = switch (firstDice) {
			case "ONE" -> {
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
		secondDice2 = switch (secondDice) {
			case "ONE" -> {
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
		result = firstDice1 + secondDice2;
		System.out.println("The result for both dice numbers is: " + result);
		System.out.println("");
		System.out.println("Have a nice day!");
		sc.close();
	}
}