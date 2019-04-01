package arrayList;

import java.util.ArrayList;

public class EmptyList {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList();
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Cat");
		l1.add("Dog");
		
		for(String l:l1) {
			System.out.println(l);
		}
		
		System.out.println("After cleaning:");
		l1.clear();
		System.out.println(l1);
		
		ArrayList<String> l2=new ArrayList();
		l2.add("Apple");
		l2.add("Banana");
		l2.add("Cat");
		l2.add("Dog");
		
		for(String l:l2) {
			System.out.println(l);
		}
		
		l2.removeAll(l2);
		System.out.println(l2);
		
	}

}
