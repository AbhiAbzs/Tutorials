package App;

import java.util.ArrayList;
import java.util.HashMap;

/// A generic class is a class

public class Application {
	public static void main(String[] args){
		
		//////// before Java 5 ///////////
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("pear");
		list.add("banana");
		
		String fruit = (String) list.get(1);
		System.out.println(fruit);
		
		//////// Modern style ///////////
		ArrayList <String> str = new ArrayList<String>();
		str.add("cat");
		str.add("dog");
		str.add("alligator");
		
		String animal = str.get(1);
		System.out.println(animal);
		
		//////// Can be more than one style arguments ///////////
		HashMap <Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "dog");
		map.put(5,"cat");
		map.put(6,"frog");
		String animal1 = map.get(5);
		System.out.println(animal1);
		
		
		//////// Java 7 style, with your own class ///////////
//		ArrayList <Animal> ani = new ArrayList<Animal>(); 
		
		
	}

}
