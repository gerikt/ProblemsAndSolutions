package CollectionTypeExcercises2;
import java.util.*;

public class Problem4 {

	public static void main(String[] args) {

		LinkedList < String> c =new LinkedList<String>();
		
		c.add("c");
		c.add("sdsf");
		c.add("blue");
		c.add("white");
		c.add("whote");
		c.add("black");
		
		System.out.println("Originall linked list : " + c);
		
		Iterator it = c.descendingIterator();
		
		System.out.println("elements in reverse order : " );

		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
	}

}
