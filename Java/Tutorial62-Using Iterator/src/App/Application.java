package App;

import java.util.Iterator;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animal = new LinkedList<String>();
		animal.add("fox");
		animal.add("cat");
		animal.add("tiger");
		animal.add("pig");

		for(String str: animal){
			System.out.println(str);
		}
		
		//// Using iterator
		System.out.println();
		System.out.println("Using Iterator ...");
		Iterator<String> it = animal.iterator();
		while(it.hasNext()){
			String value = it.next();
			if(value.equals("cat")) it.remove();
			System.out.println(value);
		}

	}

}
