import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab2 {
	
	public void readFile() {
		int nameCount = 0;
		String seatNames[][] = new String [1][1];
		File inputFile = new File("names.dat");
		try {
			Scanner fileReader = new Scanner(inputFile);
			while (fileReader.hasNextLine()){
				fileReader.nextLine();
				nameCount++;
			}
			fileReader.close();
		} 
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			Scanner fileReader = new Scanner(inputFile);
			while (fileReader.hasNextLine()){
				
			}
	}
	
    public static void main(String args[]) {
	Lab2 test = new Lab2();
	test.readFile();
    }
}
