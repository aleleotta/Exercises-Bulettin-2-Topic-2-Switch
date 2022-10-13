package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		double a,b,c; //Declaration of variables
		String operator; //Specific variable intended for operators declared. 
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Enter the value (a): "); //The program starts asking the user for value input.
		a = sc.nextDouble(); //User (a) input
		System.out.println("Enter the value (b): ");
		b = sc.nextDouble();//User (b) input
		System.out.println("Please choose an operator to use between the two numbers: "); //The program asks for an operator to be typed in as input.
		operator = sc.next(); //User (+,-,*,/) input
		switch (operator){ //Switch block begins
		case "+": //Operation will start with selected operator and then print it out to the user.
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
			System.out.println("Invalid!"); //If none of the operator get typed then there will be an error.
		}
		sc.close(); //Closing scanner
	}
}
