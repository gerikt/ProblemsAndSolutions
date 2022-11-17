package CollectionTypeExcercises;
import java.util.*;

public class Problem14 {

	public static void main(String[] args) {

		List<String> c1 = new ArrayList<String>();
		
		c1.add("one");
		c1.add("two");
		c1.add("three");
		c1.add("four");
		System.out.println("the list before is : " + c1);
		
		Collections.swap(c1, 0, 1);
		
		System.out.println("the list before is : " + c1);
	}

}
