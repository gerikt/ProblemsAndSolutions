package CollectionTypeExcercises;
import java.util.*;


public class Problem2 {
	public static void main(String [] args)
	{
		List<String> listStrings = new ArrayList<String>();
		
		listStrings.add("Red");
		listStrings.add("green");
		listStrings.add("white");
		listStrings.add("orange");
		listStrings.add("black");
		
		for(String element : listStrings)
		{
			System.out.print(element + " ,");
		}

	}

}
