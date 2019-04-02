package Tree;

import java.util.TreeSet;

public class NavigableSet {

	public static void main(String[] args) {
		TreeSet<String>set  =new TreeSet<String>();
		set.add("A");
		set.add("C");
		set.add("D");
		set.add("B");
		set.add("S");
		
		
		System.out.println("Initial Set: "+set);
		
		System.out.println("Reverse Set: "+set.descendingSet());
		System.out.println("Head: "+set.headSet("C",true));
		System.out.println("SubSet: "+set.subSet("A",false,"S",true ));
		System.out.println("TailSet: "+set.tailSet("D", true));
	}

}
