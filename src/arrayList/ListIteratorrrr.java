package arrayList;
import java.util.*;
public class ListIteratorrrr {

	public static void main(String[] args) {
    List<String>a1=new ArrayList<String>();
    
    a1.add("Shohan");
    a1.add("siyam");
    a1.add("mamun");
    a1.add("ratul");
    
    ListIterator<String> itr=a1.listIterator();
    System.out.println("Traversing elements in forward direction.");
    
    while(itr.hasNext()) {
        System.out.println("Index: "+itr.nextIndex()+ " Value "+itr.next());
    }
    System.out.println();
    
    System.out.println("Traversing elements in backword direction.");
    while(itr.hasPrevious()) {
    	System.out.println("Index: "+itr.previousIndex()+" Value "+itr.previous());
    }
	}

}
