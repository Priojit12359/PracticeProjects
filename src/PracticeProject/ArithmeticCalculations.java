package PracticeProject;

/*As a developer, write a Java code to create a calculator to perform the four basic arithmetic operations
 *(addition, subtraction, multiplication, and division).
 **/
public class ArithmeticCalculations {
	public static final String PROGRAM_NAME = "artihmetic calculator".toUpperCase();

	// Method performing Addition
	public double addition(double... args) {
		double sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return sum;
	}

	// Method performing Subtraction
	protected static double subtraction(double... args) {
		double subtract = args[0];
		for (int i = 1; i < args.length; i++) {
			subtract -= args[i];
		}
		return subtract;
	}

	// Method performing Multiplication
	static double multiplication(double... args) {
		double multiply = args[0];
		for (int i = 1; i < args.length; i++) {
			multiply *= args[i];
		}
		return multiply;
	}

	// Method performing Division
	public static double division(double... args) {
		double divide = args[0];
		for (int i = 1; i < args.length; i++) {
			divide /= args[i];
		}
		return divide;
	}

	// Method to convert String array to Double array.
	static double[] convertingStringArrayToDouble(String... param) {
		double[] numbers = new double[param.length];

		// Iterating over the string array and type casting it into double.
		int i = 0;
		for (String input : param) {
			numbers[i++] = Double.valueOf(input);
		}
		return numbers;
	}

}
