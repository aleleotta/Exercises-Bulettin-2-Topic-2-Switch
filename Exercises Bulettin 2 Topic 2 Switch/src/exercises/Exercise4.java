package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int firstDice, secondDice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll the dices.");
		System.out.println("What number did the first dice get: ");
		firstDice = sc.nextInt();
		System.out.println("What number did the second dice get: ");
		secondDice = sc.nextInt();
		sc.close();
	}
}
