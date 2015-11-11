package App;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Writing Objects ...");
		
		Person p1 = new Person(255, "Mike");
		Person p2 = new Person(555, "John");
		
		System.out.println(p1);
		System.out.println(p2);
		
		try (FileOutputStream fs = new FileOutputStream("people.bin")) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(p1);
			os.writeObject(p2);
			os.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}	

	}

}
