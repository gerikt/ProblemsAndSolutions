package CollectionTypeExcercises2;
import java.util.*;

public class Problem5 {

	public static void main(String[] args) {

		LinkedList<String> c = new LinkedList<String>();
		
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		
		c.add(2, "ten thousant");
		
		System.out.println(c);
		c.addFirst("first");
		c.addLast("last");
		System.out.println(c);
		
	}

}
