package arrayList;
import java.util.*;
class Book1{
	int id;
	String name ,author,publisher;
	
	
	 Book1(int id,String name,String author,String publisher) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
	}
}




public class Book {

	public static void main(String[] args) {
		List<Book1>list=new ArrayList<Book1>();
		
		Book1 b1=new Book1(102,"Let us c","Rafiq" ,"advance");
		Book1 b2=new Book1(135,"Teach youself","harverd","Mc");
		
		
		list.add(b1);
		list.add(b2);
		
		
		for(Book1 b:list) {
		  System.out.println(b.id+ " -"+b.author+" -"+b.name+" -"+b.publisher);
		}
		

	}

}
