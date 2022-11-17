package CollectionTypeExcercises;
import java.util.*;

public class Problem6 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String> ();
		
		list.add("green");
		list.add("Grey");
		list.add("brown");
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);

		System.out.println(list.contains("brown"));
		
		
	}

}
