package CollectionTypeExcercises;
import java.util.*;

public class Problem8 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("red");
		list.add("white");
		list.add("blue");
		list.add("black");
		list.add("green");
		list.add("orange");
		System.out.println("list before sort :" + list);
		
		Collections.sort(list);
		System.out.println("the list after sorting :" + list) ;

	}

}
