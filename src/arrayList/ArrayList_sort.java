package arrayList;
import java.util.*;

public class ArrayList_sort {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Bangladesh");
		list.add("India");
		list.add("Canada");
		list.add("Srilongka");
		list.add("Colombo");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println( );
	   Collections.sort(list);
	   System.out.println("After sorting:");
	   for(String s:list) {
		   System.out.println(s);
	   }
		
		
	}

}
