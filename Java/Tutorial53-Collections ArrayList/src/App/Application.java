package App;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		///Adding
		nums.add(11);
		nums.add(55);
		nums.add(88);
		
		//Geting
		System.out.println("The third number is : " + nums.get(2));
		
		for(int i=0; i<nums.size(); i++){
			System.out.println("The " + i + "th number is : " + nums.get(i));
		}
		
		/// Removing
		
		/// this is very slow
		nums.remove(1);
		
		for(Integer value: nums){
			System.out.println("Current number is : " + value);
		}
		
	}

}
