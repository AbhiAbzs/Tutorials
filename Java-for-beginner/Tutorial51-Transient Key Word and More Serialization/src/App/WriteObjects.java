package App;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class WriteObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Writing Objects ...");
		
		Person p = new Person(255, "Mike");
		
		try (ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream("people.bin"))) {
			
			p.setCount(88);
			os.writeObject(p);
			
			os.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}	

	}

}
