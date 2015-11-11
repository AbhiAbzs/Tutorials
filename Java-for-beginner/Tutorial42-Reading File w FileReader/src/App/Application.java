package App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("text.txt");
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			while((line=br.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found: " + file);
		}catch (IOException e){
			System.out.println("Unable to read : " + file);
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Can not close file : " + file.toString());
			} catch (NullPointerException ex){
				/// file may not open
			}
		}
		
	}

}
