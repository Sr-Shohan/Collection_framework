package vector;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>(5,3);
		v.addElement("Apple");
		v.addElement("Banana");
		v.addElement("Download");
		
		for(String i:v) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Size is:"+v.size());
		System.out.println("Dauble capacity increment is:"+v.capacity());
		
		Enumeration<String> en = v.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	         System.out.print(en.nextElement() + " ");
		

	}

}
