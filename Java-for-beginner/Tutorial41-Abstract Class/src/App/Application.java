package App;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera cam1 = new Camera();
		cam1.setID(6);
		cam1.run();
		
		Car car1 = new Car();
		car1.setID(5);
		car1.run();
		
		/* Machine is Abstract, can not instantiate
		  Machine mch1 = new Machine();
		 */
	}

}
