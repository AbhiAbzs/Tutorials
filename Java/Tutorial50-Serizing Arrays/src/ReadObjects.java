

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Reading Objects ...");
		
		try (FileInputStream fs = new FileInputStream("people.bin")) {
			ObjectInputStream os = new ObjectInputStream(fs);
			
			Person[] p = (Person[]) os.readObject();
			for(Person p1: p){
				System.out.println(p1);
			}			
			
			@SuppressWarnings("unchecked")
			ArrayList<Person> pl = (ArrayList<Person>)os.readObject();
			for(Person p1: pl){
				System.out.println(p1);
			}
			
			int num = os.readInt();
			for(int i=0; i<num; i++){
				Person pp = (Person) os.readObject();
				System.out.println(pp);
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
