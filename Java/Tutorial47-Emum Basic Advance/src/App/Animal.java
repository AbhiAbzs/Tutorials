package App;

public enum Animal {
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry"); /// instance must be instaniated
	
	private String name;
	
	/// constructor can not have modifier, public, private etc
	Animal(String name){	
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return "This animal is " + name;
	}
	
}
