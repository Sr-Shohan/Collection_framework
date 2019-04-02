package map;
import java.util.*;
public class CompareingByKey {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<Integer,String>();
		m.put(110, "shohan");
		m.put(121,"Siyam");
		m.put(123,"Mamun");
		
		m.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		
		.forEach(System.out::println);
	}

}
