package App;

class Frog{	
	public int a ;
	public String name;
}

class Fly{
	public String toString() {
		return "I can fly ...";
	}
}

public class Application {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		System.out.println(frog1.toString());
		
		Fly fly1 = new Fly();
		System.out.println(fly1.toString());

	}

}
