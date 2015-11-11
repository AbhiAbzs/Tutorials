package App;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) throws FileNotFoundException{
		String input = "/Users/xueliang/Languages/Scripts/perl/log";
		
		File textF = new File(input);
		
		Scanner in = new Scanner(textF);
		int count = 1;
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(count + "  " + line);
			count++;
		}
		in.close();

	}

}
