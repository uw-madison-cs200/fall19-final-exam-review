import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Exceptions
 * - Handling (try/catch/finally)
 * - Checked vs unchecked
 *
 * - only catch superclass
 * - catch superclass first
 * - rethrow an exception in catch block
 * - return in both catch and finally
 * - throw in both catch and finally
 * - checked/unchecked
 * 
 * @author Yuanfang
 */

public class Exceptions {
    public static void main(String[] args) {
    		String result = method4();
    		System.out.println(result);
    }

    // only catch superclass
    private static void method1(){
        String filename = "DoesNotExist.txt";

        File f = new File(filename);
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        catch (Exception e) {
            //e.printStackTrace();
        }
    }

    // catch superclass first
    private static void method2(){
        String filename = "DoesNotExist.txt";

        File f = new File(filename);
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    // rethrow an exception in catch block
    private static void method3() throws Exception{
        String filename = "DoesNotExist.txt";

        File f = new File(filename);
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            //e.printStackTrace();
            throw new Exception("exception");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // return in both catch and finally
    private static String method4(){
        String filename = "DoesNotExist.txt";

        File f = new File(filename);
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            return "catch";
        }
        finally {
            return "finally";
        }
    }

    // throw in both catch and finally
    private static void method5()throws Exception{
        String filename = "DoesNotExist.txt";

        File f = new File(filename);
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            throw new FileNotFoundException("catch");
        }
        finally {
            throw new Exception("finally");
        }
    }
}
