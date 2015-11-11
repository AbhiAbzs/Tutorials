
public class MathTestApp {

	public static void main (String[] args){
		Short x = 6;
		int y = 92;
		float a = 9.9f;
		double b = 2.2;
		
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("x + y = " + (x+y));
		System.out.println("y%x = " + (y%x));
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a/b = " + (a/b));
		
		short z = x++; /// z=x (6), then x++
		short m = x++; /// m=x (7), then x++
		short n = --m; /// m--, then n=m (6)
		System.out.println("x = " + x + ", z = " + z + ", m = " + m + ", n = " + n);
		
		double a1, a2, a3;
		a1 = a2 = a3 = 22.2d;
		System.out.println("a1 = " + a1 + ", a2 = " + a2 + ", a3 = " + a3);
		a1 += 5;  /// same as c/c++
		System.out.println("a1 = " + a1);
	
	}
	
}
