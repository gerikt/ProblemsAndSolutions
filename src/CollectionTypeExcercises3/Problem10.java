package CollectionTypeExcercises3;
import java.util.*;


public class Problem10 {

	public static void main(String[] args) {

		//comparee 2 hashsSets
		
		HashSet < String> c1 = new HashSet<String>();
		HashSet<String> c2 = new HashSet<String>();
		
		c1.add("one");
		c1.add("two");
		c1.add("three");
		c1.add("four");
		
		c2.add("one");
		c2.add("two");
		c2.add("three");
		c2.add("four");
		
		HashSet < String> c3 = new HashSet<String>();
		
		for(String element : c1)
		{
			System.out.println( c2.contains(element) ? "Yes" : "No");
			
		}
		
		
	}

}
