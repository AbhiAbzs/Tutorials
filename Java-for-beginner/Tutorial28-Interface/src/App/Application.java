package App;

public class Application {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("John");
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		((Person) info2).greet();
		
		printInfo(info1);
		printInfo(person1);
	}

	private static void printInfo(Info info) {
		info.showInfo();
	}
}
