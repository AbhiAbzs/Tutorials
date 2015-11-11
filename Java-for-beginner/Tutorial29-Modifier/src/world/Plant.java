package world;

public class Plant {
	public String name;
	
	// Acceptable pratice --- it is final
	public static final int ID = 2;
	
	private String type; /// only access within same class
	
	protected String size;
	protected double height;
	
	public Plant(){
		this.name = "Freddy";
		this.type = "Plant"; /// only access in Plant
	}
	
}
