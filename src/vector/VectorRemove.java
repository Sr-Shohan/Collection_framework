package vector;

import java.util.Vector;

public class VectorRemove {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.addElement("Apple");
		v.addElement("Banana");
		v.addElement("Cat");
		
		System.out.println("Vector elements before remove()");
        for(int i=0;i<v.size();i++) {
        	System.out.println(v.get(i));
        }
        
        v.remove("Apple");
        v.remove(2);
		
        System.out.println("Vector elements after remove()");
        for(int i=0;i<v.size();i++) {
        	System.out.println(v.get(i));
        }

	}

}
