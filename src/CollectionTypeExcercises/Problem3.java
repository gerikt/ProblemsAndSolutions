package CollectionTypeExcercises;
import java.util.*;

public class Problem3 {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<String>();
		
		listStrings.add("Red");
		listStrings.add("green");
		listStrings.add("white");
		listStrings.add("black");
		
		System.out.println(listStrings);
		
		listStrings.add(0,"Pink");
		listStrings.add(5,"yellow");
		
		System.out.println(listStrings);

				

	}

}
