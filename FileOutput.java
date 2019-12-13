import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileOutput {

	/**
	 * The main method of the FileOutput class for CS200 Final Exam Review
	 * It calls 3 different examples that discuss basic file output, printf, 
	 * and possible exceptions that can occur. 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// First Example
			exampleOne();
			System.out.println("Example One Completed.");

			// Second Example
			exampleTwo();
			System.out.println("Example Two Completed.");

			// Third Example
			exampleThree();
			System.out.println("Example Three Completed.");
		} catch (Exception e) {
			System.out.println("Error Occured.");
		}
	}

	/**
	 * Example One: Basic File Output.
	 */
	public static void exampleOne() {
		PrintWriter writer = null;
		try {
			// Creates a string that holds the name of the file we are creating
			String outputFileName = "outputFile";
			// Creates the Print Writer. This is what we will use to write
			// to our new file. It will create a file called "outputFile".
			writer = new PrintWriter(outputFileName);

			// What will this print?
			for (int i = 1; i <= 10; i++) {
				// This is how we write to the file. Instead of writing to the
				// System, we are writing to a file.
				writer.println(i + " ");
			}
		} catch (FileNotFoundException f) {
			System.out.println("ERROR: File Not Found. 1");
		} finally {
			// This will always happen
			writer.close();
		}
	}

	/**
	 * Example Two: using printf(). FOR MORE PRACTICE VISIT LAB 11 EXERCISE 1.
	 */
	public static void exampleTwo() {
		PrintWriter writer = null;
		try {
			String begin = "Beginning of File";
			String end = "Ending of File";
			// Creates a string that holds the name of the file we are creating
			String outputFileName = "anotherOutputFile";
			// Creates the Print Writer. This is what we will use to write
			// to our new file. It will create a file called "outputFile".
			writer = new PrintWriter(outputFileName);

			// What will this print?
			writer.printf("~ %s ~\n", begin);
			for (int i = 1; i <= 10; i++) {
				// This is how we write to the file. Instead of writing to the
				// System, we are writing to a file.
				writer.printf("*%15d*\n", i);
			}
			writer.printf("~ %s ~", end);
		} catch (FileNotFoundException f) {
			System.out.println("ERROR: File Not Found. 2");
		} finally {
			// This will always happen
			writer.close();
		}
	}

	/**
	 * Example Three: Exceptions
	 */
	public static void exampleThree() {
		PrintWriter writer = null;
		try {
			// Creates a string that holds the name of the file we are creating
			String outputFileName = "nextOutputFile";
			// Creates the Print Writer. This is what we will use to write
			// to our new file. It will create a file called "outputFile".
			writer = new PrintWriter(outputFileName);

			// What will this print?
			for (int i = 1; i <= 10; i++) {
				// This is how we write to the file. Instead of writing to the
				// System, we are writing to a file.
				writer.printf(i + " ");
			}
		} catch (FileNotFoundException f) {
			System.out.println("ERROR: File Not Found. 3");
		} finally {
			// This will always happen.
			writer.close();
		}
	}

}
