package App;

interface Executable {
	int execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		int value = e.execute();
		System.out.println("Rerurn value is: " + value);
	}
}

public class Application {
	
	public static void main(String[] args){

		Runner runner = new Runner();
		runner.run(new Executable() {
			public int execute(){
				System.out.println("Hello There ...");
				return 6;
			}
		});
		System.out.println("===============================");
		
		runner.run(()->{
			System.out.println("This is code passed in a lambda expression ...");
			System.out.println("Hello There1 ...");
			return 7;
		});
		
	}
}
