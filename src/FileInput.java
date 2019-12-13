/**
 * File Input
 * - Reading/parsing a file
 * - What errors?
 * 
 * @author T.J. Wilder
 *
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInput {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream dataFile = new FileInputStream("examplePaths/work/class/cs200/data.csv");
		parseFile1(dataFile);
	}

	public static void parseFile1(FileInputStream dataFile) throws FileNotFoundException {
		Scanner scnr = new Scanner(dataFile);
		
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<Double> ratings = new ArrayList<>();
		ArrayList<String> durations = new ArrayList<>();
		
		// Throw out the header line
		scnr.nextLine();
		
		while (scnr.hasNextLine()) {
			String line = scnr.nextLine();
			String[] fields = line.split(",");
			titles.add(fields[0]);
			ratings.add(Double.parseDouble(fields[1]));
			durations.add(fields[2]);
		}
		
		System.out.println(titles);
		System.out.println(ratings);
		System.out.println(durations);
	}

	public static void parseFile2(File dataFile) throws FileNotFoundException {
		Scanner scnr = null;
		try {
			scnr = new Scanner(dataFile);
			
			ArrayList<String> titles = new ArrayList<>();
			ArrayList<Double> ratings = new ArrayList<>();
			ArrayList<String> durations = new ArrayList<>();
			
			// Throw out the header line
			while (scnr.hasNextLine()) {
				if (!scnr.nextLine().isEmpty())
					break;
			}
			
			while (scnr.hasNextLine()) {
				String line = scnr.nextLine();
				// Ignore empty lines
				if (line.isEmpty())
					continue;
				
				String[] fields = line.split(",");
				// Make sure the line is the right length
				if (fields.length != 3)
					continue;
				
				titles.add(fields[0]);
				// What problem could still happen here?
				try {
					ratings.add(Double.parseDouble(fields[1]));
				}
				catch (NumberFormatException nfe) {
					continue;
				}
				durations.add(fields[2]);
			}
			
			System.out.println(titles);
			System.out.println(ratings);
			System.out.println(durations);
		}
		// Do we need this?
		catch (FileNotFoundException fnfe) {
			throw fnfe;
		}
		finally {
			// If we successfully opened the scanner, close it
			if (scnr != null)
				scnr.close();
		}
	}
}
