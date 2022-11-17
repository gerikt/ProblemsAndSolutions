package CollectionTypeExcercises3;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {

		HashSet<String> c = new HashSet<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		
		System.out.println(c);
		//3
		for(String p : c)
		{
			System.out.println(p);
		}
		//3
		System.out.println(c.size());
		//4
		c.removeAll(c);
		
		System.out.println(c);
		//5
		System.out.println("is the hashSet empty? " + c.isEmpty());
		
		//6
		HashSet < String> cClone = new HashSet<String>();
		
		cClone=(HashSet)c.clone();
		System.out.println("Cloned hashSet is : " + cClone);
		
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		//7
		//convert Hashset to array
		
		String [] newArray = new String[c.size()];
		c.toArray(newArray);
		
		for(String p : newArray)
			
		{
		System.out.println(p);
		}
		
		System.out.println(newArray);
		
		//8
		
		Set < String > tree = new TreeSet<String>(c);
		
		System.out.println("TreeSet elements : ");
		for ( String element : tree)
		{
			System.out.println(element);
		}
		
		
		//9
		
		List <String> arr = new ArrayList<String>(c);
		
		System.out.println("Arraylist elements : " );
		for (String element : arr)
		{
			System.out.println(element);
		}
		
		
	}

}
