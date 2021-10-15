package PracticeProject;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		ArithmeticCalculations ac = new ArithmeticCalculations();

		System.out.println(ArithmeticCalculations.PROGRAM_NAME + "\n");
		/* Taking input from user */
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Select any option from below list:-" + "\n" + "Enter 1 for Addition" + "\n" + "Enter 2 for Subtraction"
						+ "\n" + "Enter 3 for Multiplication" + "\n" + "Enter 4 for Division" + "\r");
		int userOption = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the numbers separacted by space." + "\r");
		String userInput = scan.nextLine();

		/* Storing values in a n array. */
		String[] numberArrays = userInput.split(" ");
		double[] num = ArithmeticCalculations.convertingStringArrayToDouble(numberArrays);

		/* Validating operation as per user input */
		if (userOption == 1) {
			System.out.println("Addition Value : " + ac.addition(num));
		} else if (userOption == 2) {
			System.out.println("Subtraction Value : " + ac.subtraction(num));
		} else if (userOption == 3) {
			System.out.println("Multiplication Value : " + ac.multiplication(num));
		} else if (userOption == 4) {
			System.out.println("Division Value : " + ac.division(num));
		} else {
			System.out.println("incorrect option entry : terminating execution".toUpperCase());
		}
	}

}
