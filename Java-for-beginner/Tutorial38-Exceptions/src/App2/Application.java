package App2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File input = new File("/Users/xueliang/Languages/Scripts/perl/logs");
		
		try {
		FileReader fr = new FileReader(input);
		}catch (FileNotFoundException e){
//			System.out.println("File not found : " + input.toString() );
			e.printStackTrace();
		}
	}

}
