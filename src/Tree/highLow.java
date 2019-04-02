package Tree;
import java.util.*;
public class highLow {

	public static void main(String[] args) {
		TreeSet<Integer>set=new TreeSet<Integer>();
	    set.add(45);
	    set.add(44);
	    set.add(12);
	    set.add(4);
	    set.add(74);
	    set.add(50);
	    
	    System.out.println("Highest value: "+set.pollFirst());
	    System.out.println("Lowest Value: "+set.pollLast());
	}

}
