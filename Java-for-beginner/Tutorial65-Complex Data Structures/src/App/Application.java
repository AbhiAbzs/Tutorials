package App;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Application {
	public static String[] vehicles = {
			"Car", "Truck", "Boat"
	};

	public static String [][] drivers = {
			{"Liu", "Li", "L"},
			{"Xue", "Xu", "X"},
			{"Aiden", "Aide", "Aid"}
	};
	
	public static void main(String[] args){
		Map <String, Set<String>> personel = new HashMap<String, Set<String>>();
		for(int i=0; i<vehicles.length; i++){
			String vehicle = vehicles[i];
			System.out.println(vehicle);
			
			String[] driverList = drivers[i];
			System.out.println(driverList.toString());
			
			Set<String> driverSet = new LinkedHashSet<String>();
			System.out.println(driverSet.toString());

			for(String driver: driverList){
				driverSet.add(driver);
			}
			
			personel.put(vehicle, driverSet);
		}
		
		//// Example 1
		Set<String> dList = personel.get("Car");
		for(String driver: dList){
			System.out.println(driver);
		}
		
		//// Example 2
		for(String vehicle: personel.keySet()){
			Set<String> dList1 = personel.get(vehicle);
			for(String driver: dList1){
				System.out.println(driver);
				}
		}
		
	}
}
