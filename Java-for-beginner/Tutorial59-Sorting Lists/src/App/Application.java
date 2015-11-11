package App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		int len1 = o1.length();
		int len2 = o2.length();
		
		if(len1 > len2) {
			return 1;
		}
		else if(len1 < len2){
			return -1;
		}	
		return 0;
	}
}

class AlphaBetaComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);  /// alpha beta order
	}
}

class ReverseAlphaBetaComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);  /// return reverse alpha beta order
	}
}


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/// Strings
		List<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("elephant");
		animals.add("donkey");
		animals.add("monkey");
		animals.add("tiger");
		
		System.out.println("Sort list in default:");
		Collections.sort(animals);
		for(String ani: animals){
			System.out.println(ani);
		}
		System.out.println("\n");
		
		System.out.println("Sort list using length Comparator:");
		Collections.sort(animals, new StringLengthComparator());
		for(String ani: animals){
			System.out.println(ani);
		}
		System.out.println("\n");
		
		System.out.println("Sort list using alpha beta order Comparator:");
		Collections.sort(animals, new AlphaBetaComparator());
		for(String ani: animals){
			System.out.println(ani);
		}
		System.out.println("\n");
		
		System.out.println("Sort list in reverse alpha beta order Comparator:");
		Collections.sort(animals, new ReverseAlphaBetaComparator());
		for(String ani: animals){
			System.out.println(ani);
		}
		System.out.println("\n");
		
		
		
		//// Integers
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(55);
		numbers.add(66);
		numbers.add(25);
		numbers.add(13);
		numbers.add(87);
		numbers.add(7);

		System.out.println("Sort integer list in default order:");
		Collections.sort(numbers);
		for(Integer num: numbers){
			System.out.println(num);
		}
		System.out.println("\n");

		System.out.println("Sort integer list in reverse order:");
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});
		for(Integer num: numbers){
			System.out.println(num);
		}
		
		
		//// Objects
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(15,"Sue"));
		people.add(new Person(7,"Liu"));
		people.add(new Person(99,"Xue"));
		people.add(new Person(55,"Zhao"));
		people.add(new Person(76,"AA"));
		
		System.out.println("Sort people accordin id:");
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2){
				if(p1.getId() > p2.getId()) {
					return 1;
				}
				else if (p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}
		});
		for(Person p: people){
			System.out.println(p);
		}
		System.out.println("\n");

		
		System.out.println("Sort people according name:");
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2){
					return p1.getName().compareTo(p2.getName());
			}
		});
		for(Person p: people){
			System.out.println(p);
		}
	}

}
