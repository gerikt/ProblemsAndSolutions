package CollectionTypeTreeSetExcercises;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {

		TreeSet < String> c1 = new TreeSet < String> ();
		
		c1.add("one");
		c1.add("two");
		c1.add("three");
		c1.add("four");
		
		for( String element : c1)
		{
			System.out.println(element
					);
		}
		
		TreeSet < String>  c2 = new TreeSet <String>();
		
		c2.add("ten");
		c2.add("twenty");
		c2.add("thirty");
		c2.add("forty");
		
		c1.addAll(c2);
		System.out.println("after adding :" + c1);
		
		Iterator it = c1.descendingIterator();
		System.out.println("elements in reverse order :");
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ,");
	
		}
		
		//5
		System.out.println();
		System.out.println(c1.first());
		System.out.println(c1.last());
		
		//6
		TreeSet<String> newSet =  (TreeSet<String>)c1.clone();
		
		System.out.println("cloned tree list : " + newSet);
		
		
		//7
		System.out.println("the size of c1 is : " +c1.size());
		
		//8
		
		
	}
	
	
	

}
