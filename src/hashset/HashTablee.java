package hashset;
import java.util.*;
public class HashTablee {

	public static void main(String[] args) {
		Hashtable<Integer,String>map=new Hashtable<Integer,String>();
		map.put(100,"Amit");
		map.put(101,"Ravi");
		map.put(120, "vijay");
		
		System.out.println(map.getOrDefault(102,"bohot hard beta"));
		System.out.println(map.getOrDefault(100,"can't find"));

	}

}
