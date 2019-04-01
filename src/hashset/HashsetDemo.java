package hashset;
import java.util.*;
public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<String> list=new HashSet<String>();
		list.add("apple");
		list.add("Banana");
		list.add("Green");
		
		//Addition of duplicate elements
		list.add("apple");
		list.add("Banana");
		
		
		//Addition null values
		list.add(null);
		
		System.out.println(list);
		
	}

}
