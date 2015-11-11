package App;

import App.Robot.Battery;
import App.Robot.Brain;

public class Application {
	
	public static void main(String[] args){
	
		Robot bt = new Robot(5);
		bt.start();
		
		/// can not call public inner class
		Robot.Brain br = bt.new Brain();
		br.think();
		
		Robot.Battery bat = new Robot.Battery();
		bat.charge();
	}

}
