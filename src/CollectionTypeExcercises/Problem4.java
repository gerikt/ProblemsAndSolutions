package CollectionTypeExcercises;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<String>();
		
		listStrings.add("Red");
		listStrings.add("green");
		listStrings.add("brown");
		listStrings.add("black");

		System.out.println(listStrings);
		
		
		String element = listStrings.get(0);
		System.out.println("first element is :" + element);
		
		element = listStrings.get(2);
		System.out.println("the third element is : " + element);
		
	}

}
