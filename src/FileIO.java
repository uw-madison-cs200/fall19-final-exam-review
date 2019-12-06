/**
 * File I/O
 *  - Input with Scanner
 *  - Output with FileWriter
 *  
 * @author Ajene
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws FileNotFoundException {
//		example1();
//		example2();
//        example3();
        example4();
	}

	public static void example1(){
		//Read input from a file
        File file = new File("./Example1.txt");
        try{
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if(!line.contains("operations")){
                    System.out.println(line);
                }else{
                    String[] operations = line.split(" ");
                    for(String operation: operations){
                        System.out.println(operation.trim());
                    }
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
	}

	public static void example2(){
	    //Tyring to read input from a path that does not exist
        File file = new File("./ExampleDirectory/Example1.txt");
        try{
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if(!line.contains("operations")){
                    System.out.println(line);
                }else{
                    String[] operations = line.split(",");
                    for(String operation: operations){
                        System.out.println(operation.trim());
                    }
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("This directory does not exist.");
        }
    }

    public static void example3(){
	    //Write to a file
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("Example3.txt");
            Random random = new Random();
            String[] words = new String[]{"Luke", "Vader", "Princess Leia", "Yoda", "Boba Fett", "Han Solo"};
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 5; j++){
                    printWriter.print(words[random.nextInt(words.length)] + (j == 4 ? ".": ", "));
                }
                printWriter.println("\n");
            }
            printWriter.print("End of file.");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(printWriter != null) printWriter.close();
        }
    }

    public static void example4() throws FileNotFoundException {
        //Write to a file with a path that does not exist.
        PrintWriter printWriter = new PrintWriter("Example4.txt/Example");
        Random random = new Random();
        String[] words = new String[]{"Luke", "Vader", "Princess Leia", "Yoda", "Boba Fett", "Han Solo"};
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++){
                printWriter.print(words[random.nextInt(words.length)] + (j == 4 ? ".": ", "));
            }
            printWriter.println("\n");
        }
        printWriter.print("End of file.");
        printWriter.close();
    }
}
