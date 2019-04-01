package hashset;
import java.util.*;
public class HashSet_TO_TreeSet {

	public static void main(String[] args) {
		HashSet<String> list=new HashSet<String>();
		list.add("siyam");
		list.add("Shohan");
		list.add("mamun");
		
		System.out.println("Elements : "+list);
		
		
		System.out.println("After converting to TreeSet");
		Set<String>t=new TreeSet<String>(list);
		for(String tree:t) {
			System.out.println(tree);
		}

	}

}
