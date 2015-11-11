package App;

import ocean.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish fish1 = new Fish();
		fish1.setName("white bass");
		fish1.setPrice(1.99);
		System.out.println("The price for " + fish1.getName() + " is : "+ fish1.getPrice());

		plant p1 = new plant();
		p1.setName("white grass");
		p1.setPrice(5.99);
		System.out.println("The price for " + p1.getName() + " is : "+ p1.getPrice());
	}

}
