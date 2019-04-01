package arrayList;
import java.util.*;
public class LinkeddList {

	public static void main(String[] args) {
	LinkedList<String>list=new  LinkedList<String>();
	  list.add("Shohanur");
	  list.add("Siyam");
	  list.add("Shawn");
	  for(String i:list) {
		  System.out.println(i);
	  }
	  System.out.println(list.size());
	  
	  list.add(3,"shohans");
	  System.out.println(list);
	  list.addFirst("Dhaka");
	  list.addLast("bd");
	  
	  System.out.println(list);
	  
	  
	  list.getFirst();
	  list.remove(2);
	  list.removeFirst();
	  System.out.println(list);
	}

}
