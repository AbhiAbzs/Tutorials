package App;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		
		try ( BufferedWriter br = new BufferedWriter( new FileWriter(file) )) {
				br.write("This is line 1 ;");
				br.newLine();
				br.write("This is line 2 ;");
				br.write("This is line 3 ;");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to write file " + file.toString());
		}	

	}

}
