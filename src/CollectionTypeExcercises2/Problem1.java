package CollectionTypeExcercises2;
import java.util.*;

public class Problem1 {

	public static void main ( String [] args)
	{
		LinkedList<String> c = new LinkedList<String> () ;
		
		c.add("Red");
		c.add("green");
		c.add("brown");
		c.add("black");
		c.add("pink");
		
		System.out.println("the linked list is : " + c);
		
		for ( String i : c)
		{
			System.out.println(i);
		}
	}
}
