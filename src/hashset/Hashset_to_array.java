package hashset;
import java.util.*;
public class Hashset_to_array {

	public static void main(String[] args) {
		HashSet<String> list=new HashSet<String>();
		list.add("apple");
		list.add("Banana");
		list.add("Green");
		System.out.println("Hashset contains: "+list);
		
		System.out.println();
		String[] a=new String[list.size()];
		list.toArray(a);
		System.out.println("Array elements:");
		for(String t:a) {
			System.out.println(t);
			
		}
		

	}

}
