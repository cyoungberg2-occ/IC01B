import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CheapScrape2CSV {

	public static void main(String[] args){

		//int columns = Integer.parseInt(args[0]); //get columns by args 0 but if comes as a string you'll have to change it to 
		//String inputfile1 = args[1];
		//String outpufileName1 = args[2];


		//File inputFile = new File("occadmins.txt");
		File inputFile = new File("text.txt");


		try {
			Scanner in = new Scanner(inputFile);
			PrintWriter out = new PrintWriter("test.csv");
			int count = 1;
			while(in.hasNextLine()) {

				
				switch (count) { 
				case 1: 
					String line = in.nextLine();
					System.out.print(line);
					out.print(line.trim()+ ",");
					count++;
					break;		           
				case 2: 
					line = in.nextLine();
					out.print("\"" + line.trim() + "\"" + ",");
					System.out.print(line);
					count++;
					break;

				case 3: 
					line = in.nextLine();
					out.print(line + ",");
					out.print(line.trim()+ ",");
					count++;
					break; 

				case 4: 
					line = in.nextLine();
					out.print(line.trim() + "\n");
					count = 1; 
					break; 

				} 

			}
			in.close();
			out.close();
		}

		catch(FileNotFoundException e) {
			System.err.println("File Not Found. Please check your source file name/location.");


		}
		catch(NumberFormatException e) {

			System.err.println("Too many columns in file. Please review source file and update.");
		}

	}


}

