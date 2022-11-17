package CollectionTypeExcercises2;
import java.util.*;

public class Problem24 {

	public static void main(String[] args) {

		LinkedList < String> c1 = new LinkedList < String>();
		LinkedList < String> c2 = new LinkedList <String>();
		
		
		c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        
	
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");
        
        LinkedList <String > c3 =new LinkedList<String>();
        for ( String e :c1)
        	c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
        
        System.out.println("check if the list is empty or not " + c3.isEmpty());
	}

}
