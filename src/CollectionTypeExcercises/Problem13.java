package CollectionTypeExcercises;
import java.util.*;

public class Problem13 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List < String> list2 = new ArrayList < String>();
		
		list1.add("blue");
		list1.add("green");
		list1.add("black");
		list1.add("white");
		list1.add("magenta");

		
		list2.add("blue");
		list2.add("green");
		list2.add("black");
		list2.add("white");
		
		//storing the comparison output in ArrayList <string>
		ArrayList<String> list3 = new ArrayList<String>();
		for(String e : list1)
			list3.add(list2.contains(e) ? "Yes" : "No");
		System.out.println( "list 3 is :" +list3);
		
		
	}

}
