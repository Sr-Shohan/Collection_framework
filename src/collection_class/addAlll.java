package collection_class;
import java.util.*;
import java.util.ArrayList;
import java.util.List;



public class addAlll {

	public static void main(String[] args) {
	    List<String> alist = new ArrayList<String>();  
        alist.add("Rahul");  
        alist.add("Karthik");  
        alist.add("OM");  
        alist.add("Shiva");  
        alist.add("Anand");  
        alist.add("Prem");  
        System.out.println("The List are: "+alist);  
       boolean b=Collections.addAll(alist,"shohan" );
        System.out.println("Boolean Result: "+b);  
        System.out.println("Collection Value: "+alist);  
        }  
}  
