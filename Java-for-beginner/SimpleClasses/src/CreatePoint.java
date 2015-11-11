import java.awt.Point;
public class CreatePoint {
	public static void main(String [] args) {
		Point pt = new Point (20,90);
		System.out.println("X = " + pt.x + ",  Y = " + pt.y);	
		pt.x = 50;
		pt.y = 20;
		System.out.println("X = " + pt.x + ",  Y = " + pt.y);
		
		/// reference
		Point pt1 = pt;
		pt.x = 500;
		pt.y = 2500;
		System.out.println("X = " + pt1.x + ",  Y = " + pt1.y);
		System.out.println("Same point ?: " + (pt1 == pt));
		
		//// class method
		String s, s2;
		s = "foo";
		s2 = s.valueOf("test");
		System.out.println("s = " + s + ", s2 = " + s2);
		s2 = String.valueOf("56");
		System.out.println("s = " + s + ", s2 = " + s2);
	}
}
