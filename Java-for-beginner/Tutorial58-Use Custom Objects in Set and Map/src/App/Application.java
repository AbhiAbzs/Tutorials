package App;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	/*
	 * hashCode will check if two objs have same content or not
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(1, "Bob");
		Person p2 = new Person(5, "Liu");
		Person p3 = new Person(9, "SAY");
		Person p4 = new Person(5, "Liu");
		
		if(p2.equals(p4)) System.out.println("p2 and p4 are equal.");
		
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		map.put(p1, 2);
		map.put(p2, 5);
		map.put(p3, 7);
		map.put(p4, 99);
		
		for(Person key: map.keySet()){
			System.out.println(key + ": " + map.get(key));
		}
		
		Set<Person> set = new LinkedHashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);
	}

}
