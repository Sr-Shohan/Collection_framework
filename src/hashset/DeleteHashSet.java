package hashset;
import java.util.*;
public class DeleteHashSet {

	public static void main(String[] args) {
		 HashSet<String>list=new HashSet<String>();
		    list.add("apple");
			list.add("Banana");
			list.add("Green");
			
			System.out.println("Before HashSet contains:"+list);
			
			
			
			list.clear();
			
			System.out.println("After Hashset contains: "+list);

	}

}
