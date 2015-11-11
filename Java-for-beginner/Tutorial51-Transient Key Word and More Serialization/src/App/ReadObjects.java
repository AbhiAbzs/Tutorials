package App;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Reading Objects ...");
		
		try (FileInputStream fi = new FileInputStream("people.bin"); ObjectInputStream os = new ObjectInputStream(fi)) {			
			Person p = (Person) os.readObject();
			System.out.println(p);	
			
			os.close();		
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}	
	}

}
