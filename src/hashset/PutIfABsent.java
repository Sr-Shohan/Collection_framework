package hashset;
import java.util.*;
public class PutIfABsent {

	public static void main(String[] args) {
		Hashtable<Integer,String>map=new Hashtable<Integer,String>();
		 map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul");
	     
	     
	     System.out.println("Inital Map: "+map);
	     
	     
	     map.putIfAbsent(105, "amir");
	     
	     System.out.println("Updated Map: :"+map);
	}

}
