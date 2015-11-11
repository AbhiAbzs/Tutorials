package App;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.name.compareTo(p.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		addElements(list);
		showElements(list);
		
		Set<String> set = new TreeSet<String>();
		addElements(set);
		showElements(set);
		
		List<Person> people1 = new ArrayList<Person>();
		Collections.sort(people1);
		addPeople(people1);
		showPeople(people1);
		
		Set<Person> people2 = new TreeSet<Person>();
		addPeople(people2);
		showPeople(people2);
		
		
	}
	
	private static void addPeople(Collection<Person> col) {
		col.add(new Person("SOB"));
		col.add(new Person("AAA"));
		col.add(new Person("LUE"));
		col.add(new Person("ZIU"));
		col.add(new Person("XUE"));
	}
	
	private static void showPeople(Collection<Person> col) {
		for(Person p: col) {
			System.out.println(p);
		}
	}
	
	private static void addElements(Collection<String> col) {
		col.add("AAA");
		col.add("SOB");
		col.add("LUE");
		col.add("ZIU");
		col.add("XUE");
	}

	private static void showElements(Collection<String> col) {
		for(String str: col) {
			System.out.println(str);
		}
	}
}
