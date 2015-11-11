

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
		
		Person[] p = {new Person(255, "Mike"), new Person(555, "John"), new Person(999, "Liu")};
		ArrayList<Person> pl = new ArrayList<Person>(Arrays.asList(p));
		
		try (FileOutputStream fs = new FileOutputStream("people.bin")) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(p);
			os.writeObject(pl);
			
			os.writeInt(pl.size());
			for(Person pp: pl){
				os.writeObject(pp);
			}
			
			os.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}	

	}

}
