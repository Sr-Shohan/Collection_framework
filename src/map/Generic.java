package map;
import java.util.*;
public class Generic {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(110,"amit");
		map.put(114,"vijay");
		map.put(115,"rahul");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}
