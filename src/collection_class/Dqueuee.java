package collection_class;
import java.util.*;
import java.util.Deque;
import java.util.LinkedList;



public class Dqueuee {

	public static void main(String[] args) {
	Deque<Integer>deque=new LinkedList<>();
	deque.offer(3);
    deque.offer(5);
    deque.offer(9);
    
    System.out.println("Initial view of the queue is : "+deque);
    deque.offer(10);
    System.out.println("New Queue value is :"+deque);
    
    Queue<Integer>q=Collections.asLifoQueue(deque);
    q.offer(45);
    q.offer(47);
    
    System.out.println("Updateded Queue: "+q);
    
	}

}
