package arithmetic;
class Box <B>
{
	
	public static <B> void get(B length, B breadth)
	{
		System.out.print("The value in integers"+length +" "+ breadth );
		System.out.print("The value in double"+length +" "+ breadth );
		
	}
	
}

public class Shapeofobject {

	
	public static void main(String[] args) {

		Box <Integer> s=new Box<Integer>();
		s.get(100,200);
		Box <Double> s1=new Box<Double>();
		s1.get(10.63566,23.6678);
		
		
	}

}
