package App;

import java.util.ArrayList;

class Machine{
	public String toString(){
		return "I am a machine !";
	}
}

class Camera extends Machine{

	@Override
	public String toString() {
		return "Camera [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		showList(list);
		
		ArrayList<Machine> mch = new ArrayList<Machine>();
		mch.add(new Machine());
		mch.add(new Machine());
		showList(mch);
		
		ArrayList<Camera> camch = new ArrayList<Camera>();
		camch.add(new Camera());
		camch.add(new Camera());
		showList(camch);
	}
	
	public static void showList(ArrayList<?> list){
		for(Object value: list){
			System.out.println(value);
		}
	}

}
