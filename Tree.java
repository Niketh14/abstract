package niketh;
import java.util.*; 
class Book{
	int id,quantity;
	String name,authorname,publisher;
	Book(int id,int quantity,String name,String authorname, String publisher){
		this.id=id;
		this.name=name;
		this.authorname=authorname;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class Tree {

	public static void main(String[] args) {
		 HashMap<Integer,Book> map=new HashMap<Integer,Book>(); 
		 Book a=new Book(001,2,"charlichampin","shrinikerh","dombosko"); 
		 Book a1=new Book(002,4,"charliampin","shrinike","dombko");  
		 Book a2=new Book(002,4,"charliampin","shrinike","dombko");  
		 map.put(1, a1);
		 map.put(2, a);
		map.put(3, a2);
		 for(Map.Entry <Integer,Book>m:map.entrySet()){ 
			 Book q=m.getValue();
		 System.out.println(q.id+" "+q.name+" "+q.authorname+" "+q.publisher);  
		 
		 }

	}
}

	
