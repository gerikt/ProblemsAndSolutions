package CollectionTypeExcercises2;
import java.util.*;

public class Problem7 {

	public static void main(String[] args) {

		LinkedList <String> c = new LinkedList<String>();
		
		c.add("one");
		c.add("two");
		c.add("threee");
		c.add("four");
		c.add("five");
		
		System.out.println("original list is : " + c);
		
		c.offerFirst("first");
		System.out.println(" after insert " + c);
		
		c.offer("last");
		
		System.out.println(c);
		
		c.add(2, "one million");
		
		System.out.println(c);
		
		LinkedList <String> c1= new LinkedList<String>();
		
		c1.add("ten");
		c1.add("twenty");
		c1.add("thirty");
		
		c.addAll(1,c1);
		
		System.out.println(" the list after combination : " + c);
	}

}
