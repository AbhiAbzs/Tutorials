package App;

public class Application {
	public static void main(String[] arg){
		Machine mch = new Machine();
		mch.start();
		mch.stop();
		
		Car car = new Car();
		car.start();
		car.stop();
		
		Machine mch1 = new Car();
		mch1.start();
		mch1.stop();
	}
}
