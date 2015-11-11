package App;

public class Car extends Machine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting the car ...");
		
	}
	
	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Go to work ...");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Shutdowing the car ...");
	}

}
