package CollectionTypeExcercises2;
import java.util.*;

public class Problem23 {

	public static void main(String[] args) {

		LinkedList <String> c = new LinkedList<String>();
		
		c.add("blue");
		c.add("red");
		c.add("white");
		c.add("black");
		
		System.out.println("the original list is : " + c);
		
		//conver to arrayList
		
		List<String> list = new ArrayList <String>(c);
		
		for (String str : list)
		{
			System.out.print(str + " ,");
		}
		
	}

}
