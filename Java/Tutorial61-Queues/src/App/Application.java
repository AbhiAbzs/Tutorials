package App;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Application {

	public static void main(String[] args) {
		// (head) <-ooooooooooooooooooo-> (tail) FIFO (first in first out)
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(5);
		q1.add(5);
		q1.add(7);
		q1.add(1);
		q1.add(54);
		q1.add(8);
				
		try{
			q1.add(99);
		} catch(IllegalStateException e){
			System.out.println("Exceding ...");
		}
		
		for(Integer v: q1){
			System.out.println("Ouput = " + v);
		}
		
		System.out.println("Removed ouput = " + q1.remove());
		
		System.out.println("Removed ouput = " + q1.remove());
		System.out.println("Removed ouput = " + q1.remove());
		System.out.println("Removed ouput = " + q1.remove());
		System.out.println("Removed ouput = " + q1.remove());

		try{
			System.out.println("Removed ouput = " + q1.remove());
		} catch (NoSuchElementException e){
			System.out.println("Queue is empty ...");
		}
		
		
		
		////////////////////////////
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		q2.offer(5);
		q2.offer(51);
		
		System.out.println("Queue 2 peek = " + q2.peek());
		
		if(q2.offer(30) == false){
			System.out.println("Queue is full ...");
		}
		for(Integer v: q2){
			System.out.println("Ouput = " + v);
		}
		System.out.println("Queue 2 pull = " + q2.poll());
		System.out.println("Queue 2 pull = " + q2.poll());
		
		System.out.println("Queue 2 peek after pull = " + q2.peek());
		

		
	}

}
