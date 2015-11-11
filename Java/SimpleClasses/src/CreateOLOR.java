
public class CreateOLOR {
	protected int a = 0;
	private int b = 0;
	public static double c = 2.5; //// class var, keeping same for all objs,
	public static final double pi = 3.1415926;  /// class var, constant variable, never change
	
	CreateOLOR(int x, int y){
		a = x;
		b = y;
	}
	CreateOLOR(int x, int y, int z){
		a = x;
		b = y;
		c = z;
	}
	int getB() {return b;}
	public static double getC() {return c;}
	void printOut() {
		System.out.println("a = " + a + ",  b = " + b + ",  c = " + c);	
	}
	public static void main(String [] args) {
		CreateOLOR spr = new CreateOLOR(10,20,3);
		spr.printOut();
		CreateOLOR spr1 = new CreateOLOR(100,200,300);
		spr1.printOut();
		/// class variable changed for obj spr
		spr.printOut();
	}
}

class subCreateOLOR  extends CreateOLOR{

	subCreateOLOR(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	void printOut() {
		super.printOut();
		System.out.println("a = " + this.a);
		System.out.println("b = " + this.getB());
		System.out.println("c = " + CreateOLOR.c);	
	}
	
	public static void main(String [] args) {
		subCreateOLOR sub = new subCreateOLOR(1,2);
		sub.printOut();
		CreateOLOR.main(args);
	}
}