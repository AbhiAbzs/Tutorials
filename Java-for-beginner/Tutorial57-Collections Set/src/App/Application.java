package App;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/// SET only store unique element

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/// HashSet does not retain order
		// Set<String> set1 = new HashSet<String>();
		
		/// LinkedHashSet remember the order you added items in
		// Set<String> set1 = new LinkedHashSet<String>();
		
		/// TreeSet in natural order
		Set<String> set1 = new TreeSet<String>();
		set1.add("dog");
		set1.add("cat");
		set1.add("pig");
		set1.add("snake");
		set1.add("bear");
		
		///Add duplicate items does nothing
		set1.add("cat");
		
		System.out.println(set1);
		
		/// Does Set contain a item
		if(set1.contains("mouse")) {
			System.out.println("Contain mouse;");
		}
		
		/// Does Set empty
		if(set1.isEmpty()) {
			System.out.println("Set is empty;");
		}
		
		
		Set<String> set2 = new TreeSet<String>();
		set2.add("dog");
		set2.add("cat");
		set2.add("donkey");
		set2.add("monkey");
		set2.add("ant");
		
		/// Intersection of two sets, common items in set1 and set2
		Set<String> intersection = new HashSet<String>(set1);
		System.out.println(intersection);
		intersection.retainAll(set2); /// retain common items in both set1 and set2
		System.out.println(intersection);
		
		/// Difference in two sets
		Set<String> diff = new HashSet<String>(set2);
		System.out.println(diff);
		diff.removeAll(set1);
		System.out.println(diff);
		
		
	}

}
