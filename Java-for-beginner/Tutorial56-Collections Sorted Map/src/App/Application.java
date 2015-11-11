package App;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp{
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		/* LinkedHashMap is a double linked list HashMap
		 * 
		 */
		LinkedHashMap<Integer, String> linkedmap = new LinkedHashMap<Integer, String>();
		
		/*TreeHashMap save item in natural order
		 * ie, for int, 1, 2, 3,4 ,5 ...
		 * for Alpha beta,  a b c d
		 * 
		 */
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		
		System.out.println("Testing HashMap ;");
		testMap(map);
		
		System.out.println("Testing LinkedHashMap ;");
		testMap(linkedmap);
		
		System.out.println("Testing TreeMap ;");
		testMap(treemap);
	}
	
	public static void testMap (Map<Integer, String> map){
		map.put(6, "Sheep");
		map.put(2, "Dog");
		map.put(16, "Mouse");
		map.put(65, "Snake");
		map.put(52, "Pig");
		map.put(67, "frog");
		
		for(Integer key: map.keySet()){
			System.out.println("Key is: " + key + "\t Content is: " + map.get(key));
		}
		
	}

}
