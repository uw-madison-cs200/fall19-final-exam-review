/**
 * Prompt (example of Scanner)
 *  - hasNext(), hasNextInt(), hasNextDouble()
 *  - next(), nextLine(), nextInt()
 *
 * @author Yuan
 */
import java.util.Scanner;

public class Prompt {
    /**
     * Prompts the user for a value by displaying prompt.
     * Note: This method should not add a new line to the output of prompt.
     *
     * After prompting the user, the method will consume an entire line of input
     * while reading an int.
     * If the value read is between min and max (inclusive), that value is returned.
     * Otherwise, "Invalid value." terminated by a new line is output and
     * the user is prompted again.
     *
     * @param sc The Scanner instance to read from System.in.
     * @param prompt The name of the value for which the user is prompted.
     * @param min The minimum acceptable int value (inclusive).
     * @param max The maximum acceptable int value (inclusive).
     * @return Returns the value read from the user.
     */
    public static int promptIntV1(Scanner sc, String prompt, int min, int max) {
        System.out.print(prompt);
        int result = sc.nextInt();
        if (result >= min && result <= max)
            return result;
        else
            System.out.println("Invalid value.");
        return result;
    }
    // problems for V1:
    // 1. not using hasNextInt
    // 2. not consuming the entire line
    // 3. not taking into account consecutive invalid things


    public static int promptIntV2(Scanner sc, String prompt, int min, int max) {
        System.out.print(prompt);
        int result = -1;
        if (sc.hasNextInt()) {
            result = sc.nextInt();
            sc.nextLine();
            if (result >= min && result <= max)
                return result;
        } else {
            System.out.println("Invalid value.");
        }

        System.out.print(prompt);
        if (sc.hasNextInt()) {
            result = sc.nextInt();
            sc.nextLine();
        }
        return result;
    }
    // problems for V2:
    // 1. not handling consecutive things correctly (might be more than once
    //     that the user type wrong stuff)

    public static int promptIntV3(Scanner sc, String prompt, int min, int max) {
        boolean validNum = false;
        int result = -1;
        while (!validNum) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                sc.nextLine();
                if (result >= min && result <= max)
                    validNum = true;
            } else {
                System.out.println("Invalid value.");
            }
        }
        return result;
    }
    // problems for V3:
    // 1. did not take out invalid line if hasNextInt is evaluated to false,
    //    this will leads to infinite loop

    public static int promptIntV4(Scanner sc, String prompt, int min, int max) {
        boolean validNum = false;
        int result = -1;
        while (!validNum) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                sc.nextLine();
                if (result >= min && result <= max)
                    validNum = true;
            } else {
                sc.nextLine();
                System.out.println("Invalid value.");
            }
        }
        return result;
    }

	public static void main(String[] args) {
        String input = null;
        int min = 0;
        int max = 10;
        // test 1, simple and valid num
        input = "5\n";

        // test 2, simple and num out of range
        input = "11\n";

        // test 3, simple and not a num
        input = "hello\n";

        // test 4, right num with text
        input = "3  ok\n";

        // test 5, consecutive invalid things
        input = "-1\n-1\n4\n";

        // test 6
        input = "-1 opamp\nthis is cool\n15\n3\n";

        // test your understanding of Scanner
        input = "a\nb\nc d e \nf g\n  h\n";
        Scanner sc = new Scanner(input);
        System.out.println("%" + sc.next() + "%");
        System.out.println("%" + sc.nextLine() + "%");
        System.out.println("%" + sc.nextLine() + "%");
        System.out.println("%" + sc.next() + "%");
        System.out.println("%" + sc.next() + "%");
        System.out.println("%" + sc.nextLine() + "%");
        System.out.println("%" + sc.nextLine() + "%");
        System.out.println("%" + sc.next() + "%");
    }
}
