package vector;
import java.*;
import java.util.PriorityQueue;
public class priorityQueue {

	public static void main(String[] args) {
		
		String  alphabets[]= {"X","A", "c"};
		PriorityQueue<String>pq=new PriorityQueue();
		for(int i=0;i<alphabets.length;i++) {
			pq.add(alphabets[i]);
			
		}
		
		System.out.println(pq);
		
		
		for(int i=0;i<alphabets.length;i++) {
			System.out.println(pq.poll());
		}
		
	}

} 
