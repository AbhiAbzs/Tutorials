package App;

import world.Plant;

public class Application {
	public static void main(String[] args){
		Plant plant = new Plant();
		//System.out.println(plant.type); /// "private" can not access with getter
		System.out.println(plant.name);
		//System.out.println(plant.size); /// "protected" can not access with getter
	
		Oka oka = new Oka();
		System.out.println(oka.name);
	}
	
}
