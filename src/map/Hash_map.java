package map;
import java.util.*;

public class Hash_map {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(4, "Ajeet");
	      hmap.put(3, "Anuj");
	      hmap.put(1,"Shohan");
	      
	      for(int i=0;i<hmap.size();i++) {
	    	  System.out.println(hmap.get(i));
	      }
	}

}
