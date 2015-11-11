package App;


import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6383404871067070986L;
	private transient int id; /// do not serialize id, ID Will be "0"
	private String name;
	
	private static int count;   //// static type can not be serialized, will be "0"
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Two argus constructor.");
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + " ]" + "Count is : " + count;
	}
	
}
