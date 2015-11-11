package App;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {
	public static void main(String[] args){
		Test test = new Test();
		
		/* try/catch
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		/*
		/// try/ multi catch
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		/// IOException and ParseException are child of Exception
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/* Inheritance tree
		 java.lang.Object
				java.lang.Throwable
					java.lang.Exception
						java.io.IOException
							java.io.FileNotFoundException 
		 */
		
		/// "FileNotFoundException" is child of IOException, and
		///  handled before "IOException"
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//// "IOException" already covered "FileNotFoundException"
		try {
			test.input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
