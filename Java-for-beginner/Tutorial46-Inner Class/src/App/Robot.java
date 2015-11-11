package App;

public class Robot {
	private int id;
	
	/// inner class
	public class Brain{
		public void think(){
			System.out.println("Robot " + id +" is thinking !");
		}
	}
	
	static class Battery{
		public void charge(){
			System.out.println("Battery charging !");
		}
	}
	
	public Robot(int id){
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot "+ id);
		
		Brain br = new Brain();
		br.think();
		
		String name = "Robert";
		class Temp {
			public void doSomething(){
				System.out.println("Robot ID is "+ id);
				System.out.println("Robot name is "+ name);
			}
		}
		
		Temp tmp = new Temp();
		tmp.doSomething();
	}

}
