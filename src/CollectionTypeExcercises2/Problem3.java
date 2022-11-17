package CollectionTypeExcercises2;
import java.util.*;

public class Problem3 {

	public static void main(String[] args) {

		LinkedList <String> c = new LinkedList<String>();
		
		c.add("blue");
		c.add("white");
		c.add("ref");
		c.add("blacl");
		c.add("grey");
		
		//set iterator at specified index
		Iterator p = c.listIterator(1);
		
		while ( p.hasNext())
		{
			System.out.println(p.next());
		}
		
	}

}
