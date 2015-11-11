package App;

public class Person implements Info {
	private String name;
	
	public Person(String str) {
		this.name = str;
	}

	public void greet(){
		System.out.println("Hello There !");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Person name is " + name);
	}

}
