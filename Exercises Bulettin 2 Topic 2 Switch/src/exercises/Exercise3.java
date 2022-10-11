package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		double a,b,c;
		String operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value (a): ");
		a = sc.nextDouble();
		System.out.println("Enter the value (b): ");
		b = sc.nextDouble();
		System.out.println("Please choose an operator to use between the two numbers: ");
		operator = sc.next();
		switch (operator){
		case "+":
			c = a + b;
			System.out.println("Result = " + c);
			break;
		case "-":
			c = a - b;
			System.out.println("Result = " + c);
			break;
		case "*":
			c = a * b;
			System.out.println("Result = " + c);
			break;
		case "/":
			c = a / b;
			System.out.println("Result = " + c);
			break;
		default:
			System.out.println("Invalid!");
		}
		sc.close();
	}
}
