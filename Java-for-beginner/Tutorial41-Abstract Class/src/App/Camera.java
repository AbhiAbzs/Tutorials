package App;

public class Camera extends Machine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting snaping ...");
		
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Preview the photos ...");	
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Shutdowing the camera ...");
	}

}
