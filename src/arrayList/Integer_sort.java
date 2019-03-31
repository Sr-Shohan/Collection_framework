package arrayList;
import java.util.*;

public class Integer_sort {

	public static void main(String[] args) {
	    ArrayList<Integer> list=new ArrayList();
	    list.add(1);
	    list.add(5);
	    list.add(7);
	    list.add(8);
	    System.out.println("Before sorting:");
	    for(Integer s:list) {
	    	System.out.println(s);
	    }
	    System.out.println();
	    System.out.println("After sorting:");
	    Collections.sort(list);
	    for(Integer s:list) {
	    	System.out.println(s);
	    }
	    
	    //Descending order
	    Collections.reverse(list);
	    for(Integer s:list) {
	    	System.out.println(s);
	    }
	}
	
	

}
