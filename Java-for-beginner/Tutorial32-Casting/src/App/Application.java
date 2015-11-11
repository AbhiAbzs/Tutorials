package App;

class Machine{
	public void start(){
		System.out.println("Machine started !");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera started !");
	}
	
	public void snap(){
		System.out.println("Take a snapshot !");
	}
	
}

public class Application {
	public static void main(String[] args){
		byte bV = 20;
		short sV = 55;
		int iV = 2;
		long lV = 22525;
		
		float fV = 55.32076f;
		double dV = 99.5;
		
		iV = (int)lV;
		
		System.out.println(iV);
	
		Machine m1 = new Machine();
		Camera c1 = new Camera();
		m1.start();
		c1.start();
		c1.snap();
		
		Machine m2 = c1;
		m2.start();
		//m2.snap();  /// not defined
		
		Machine m3 = new Camera();
		Camera c2 = (Camera) m3;
		c2.start();
		c2.snap();
	
		/// give run time errors
	//	Machine m4 = new Machine();
	//	Camera c3 = (Camera) m4;
	//	c3.start();
		//c3.snap();
		
		
	}
}