package CollectionTypeTreeSetExcercises;
import java.util.*;

public class Problem8 {

	public static void main(String[] args) {

		TreeSet < String > c1 = new TreeSet<String>();
		TreeSet<String> c2 = new TreeSet<String>();
		
		c1.add("one");
		c1.add("two");
		c2.add("three");
		
		c2.add("one");
		c2.add("two");
		c2.add("three");
		
		TreeSet<String> result = new TreeSet<String>();
		
		for(String element : c1)
		{
			System.out.println(c2.contains(element) ? "Yes" : "No");
		}
		
	}

}
