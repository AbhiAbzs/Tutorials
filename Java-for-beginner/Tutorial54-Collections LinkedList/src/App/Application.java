package App;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ArrayLists manage arrays internally
		 * [0] [1] [2] [3] [4] [5] ...
		 * If add item elsewhere other than the end, the ArrayList
		 * will move all elements afterward to next, make it VERY slow
		 */
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		/*
		 * LinkedList consists of elements where each element
		 * has a reference to the previous and next element
		 * [0]->[1]->[2]->[3]->[4]->[5] .....
		 *       <-   <-   <-
		 */
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		doTiming("ArrayList", arraylist);
		doTiming("LinkedList", linkedlist);

	}
	
	private static void doTiming(String type, List<Integer> list){
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*
		 * LinkedList does not cat where to add the list, Array
		 */
		
		/// add items at the end of list, LinkedList is slower
		/*
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
		*/
		
		/// add items elsewhere in the list, ArrayList is MUCH slower
		for(int i=0; i<1E5; i++){
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time token is: " + (end - start) + " ms");
		
	}

}
