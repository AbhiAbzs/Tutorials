package App;

public class Application {

	private static final String MOUSE = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = Animal.DOG;
		
		switch(animal){
		case DOG:
			System.out.println("This is a " + animal);
			break;
		case CAT:
			System.out.println("This is a " + animal);
			break;
		case MOUSE:
			System.out.println("This is a " + animal);
			break;
		default:
			System.out.println("This is a animal we do not know.");
			break;
		}
		
		System.out.println("This is a " + animal.getClass());
		System.out.println(animal instanceof Enum);
		
		System.out.println(animal.DOG.getName());
		
		System.out.println("Enum name as: " + Animal.DOG.name());
		
		Animal anm2 = Animal.valueOf("CAT");
		System.out.println(anm2);

	}

}
