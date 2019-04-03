package enum_;
import java.util.*;
public class Enum_map {
	 public enum Days {  
		   Monday, Tuesday, Wednesday, Thursday  
		   };  
		   public static void main(String[] args){  
           EnumMap<Days,String>map=new EnumMap<Days,String>(Days.class);
           map.put(Days.Monday,"1");
           map.put(Days.Wednesday, "3");
           
           for(Map.Entry m: map.entrySet()) {
        	   System.out.println(m.getKey()+" "+m.getValue());
           }
}
}
