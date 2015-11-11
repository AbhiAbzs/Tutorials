package App;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(6, "Da Shun");
		map.put(7, "Qi");
		map.put(2, "Er");
		map.put(9, "Jiu");
		map.put(1, "Yi");
		
		map.put(2, "Hello"); // Will override previous key

		String text = map.get(2);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			
			System.out.println(map.get(key)); /// follow ascending 
		}
	}

}
