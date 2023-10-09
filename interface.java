package arithmetic;
interface Searchable{
	boolean search(String keyword);
}
 class Document implements Searchable{
	 String message;
	 public Document(String message){
		 this.message=message;
	 }
	public boolean search(String keyword) {
		if(message.contains(keyword))
		{
			return true;
		}
		return false;
 
	}
	
}
public class Interfaceclass {

	public static void main(String[] args) {
		
		Document a=new Document("Hello niketh");
		
		System.out.println(a.search("niketh"));
	}

}
