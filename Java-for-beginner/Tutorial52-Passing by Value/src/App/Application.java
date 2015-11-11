package App;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app = new Application();
		int value = 7;
		System.out.println("1):  Value is : " + value);
		app.show(value);
		System.out.println("4):  Value is : " + value);
		
		Person person = new Person(555, "Bob");
		System.out.println("1):  Person is : " + person);
		app.show(person);
		System.out.println("4):  Person is : " + person);
	}
	
	/// API
	public void show(int value){
		System.out.println("2):  Value is : " + value);
		value=8;
		System.out.println("3):  Value is : " + value);
	}
	
	public void show(Person person){
		System.out.println("2):  Value is : " + person);
		person.setName("XUE"); /// here person is the addr passed in
		person = new Person(999, "Liu"); /// here person is another obj, different addr as passed in value
		System.out.println("3):  Value is : " + person);
	}

}
