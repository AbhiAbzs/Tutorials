package App;


public class Person {

	private int id;
	private String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Ono argus constructor.");
	}
	
	public void setName(String name){
		this.name = name;
	}
		
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two argus constructor.");
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + " ]";
	}
	
}
