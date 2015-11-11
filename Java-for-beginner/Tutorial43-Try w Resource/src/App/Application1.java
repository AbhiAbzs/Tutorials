package App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {
	public static void main(String[] args){
		File file = new File("test.txt");
	
		try ( BufferedReader br = new BufferedReader( new FileReader(file) )) {
			String line;
			while((line=br.readLine()) != null){
				System.out.println(line);
			}		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can not open file " + file.toString());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file " + file.toString());
		}	
	}

}
