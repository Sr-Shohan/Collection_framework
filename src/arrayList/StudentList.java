package arrayList;
import java.util.*;

class Student{
	String name,cllass;
     int id;
     
     
     Student(int id,String name,String cllass){
    	 this.id=id;
    	 this.name=name;
    	 this.cllass=cllass;
     }
	
}

public class StudentList { 

	public static void main(String[] args) {
		
		
		LinkedList<Student> list=new LinkedList<Student>();
		
         Student s1=new Student(101,"kamla","nine");
         Student s2=new Student(102,"nigga","ten");
         Student s3=new Student(103,"john","seven");
         Student s4=new Student(104,"kayes","nine");
         Student s5=new Student(105,"kamal","nine");
         
         
         list.add(s1);
         list.add(s2);
         list.add(s3);
         list.add(s4);
         list.add(s5);
         for(Student s:list) {
        	 System.out.println(s.id+" "+s.name+" "+s.cllass );
         }
         
	}

}
