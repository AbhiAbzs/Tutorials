package App;

class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing !");	
		throw new Exception("oh no !");
	}
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		Temp temp = new Temp();
		try {
			temp.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

		try (Temp temp = new Temp()){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
