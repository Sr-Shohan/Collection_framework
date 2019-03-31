package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("shohanur rahman");
		System.out.println(list);
		
	     list.add(2, "E");
	     System.out.println(list);
	     
	    System.out.println();     
	     list.remove("A");
	     list.remove(2);
		 System.out.println("After remove some index:");
		 System.out.println(list);
		  System.out.println();
		  
		  
		 ///* Advanced For Loop*/
		 for( String i:list) {
			 System.out.println(i);
		 }
		 
		 /* For Loop for iterating ArrayList */
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 

		  /* While Loop for iterating ArrayList*/ 		
	      System.out.println("While Loop"); 		
	      int count = 0; 		
	      while (list.size() > count) {
	    	  
		 System.out.println(list.get(count));
		 count++;
	        
	      }
	      System.out.println();
	      
	      //Iterator........
	      System.out.println("Iterator:");
	      Iterator<String>ite=list.iterator();
	      while(ite.hasNext()) {
	    	  System.out.println(ite.next());
	      }

	}

}
