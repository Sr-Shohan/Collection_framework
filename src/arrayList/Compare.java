package arrayList;
import java.util.*;

public class Compare {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList();
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Cat");
		l1.add("Dog");
		
		for(String l:l1) {
			System.out.println(l);
		}
		
		System.out.println();
		
		ArrayList<String>l2=new ArrayList();
		l2.add("Apple");
		l2.add("Banana");
		l2.add("Cat");
		l2.add("dog");
		for(String ll:l2) {
			System.out.println(ll);
		}
		
		ArrayList<String>l3=new ArrayList();
		for(String temp:l1) 
			l3.add(l2.contains(temp)?"yes":"no");
			System.out.println(l3);
		
		
       
	}
}

