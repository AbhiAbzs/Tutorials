package App;

class Machine{
	public void start(){
		System.out.println("Start the machine !");
	}
}

interface Plant {
	public void grow();
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine m1 = new Machine() {
		@Override public void start(){
				System.out.println("Camera snaping ... ");
			}
		};
		m1.start();

		/// Plant p1 = new Plant(); /// compile error, since Plant is not a class
		Plant p1 = new Plant(){
			@Override
			public void grow(){
				System.out.println("Plant growing ... ");
			}
		};
		p1.grow();
	}

}
