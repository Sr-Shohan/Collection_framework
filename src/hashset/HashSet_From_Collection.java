package hashset;
import java.util.*;
public class HashSet_From_Collection {

	public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("String");
	list.add("Ajay");
	list.add("Vijay");
	
	HashSet<String>set=new HashSet<String>(list);
	set.add("shohan");
	Iterator<String>i=set.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}

}
