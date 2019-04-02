package Tree;
import java.util.*;
public class TreeSet_Example_1 {

	public static void main(String[] args) {
		TreeSet<String>t=new TreeSet<String>();
		t.add("Shohan");
		t.add("Siyam");
		t.add("shuvo");
		t.add("ratul");
		
		Iterator<String>itr=t.iterator();
		while(itr.hasNext()) {
			System.out.println("Value: "+itr.next());
		}

	}

}
