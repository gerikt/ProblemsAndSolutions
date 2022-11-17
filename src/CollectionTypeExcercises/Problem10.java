package CollectionTypeExcercises;
import java.util.*;


public class Problem10 {

	public static void main(String[] args) {

		List<String>  list = new ArrayList < String>();
		
		list.add("blue");
		list.add("oraange");
		list.add("black");
		list.add("white");
		list.add("mov");
		
		System.out.println("list before shuffle : " + list);
		Collections.shuffle(list);
		System.out.println("list after shuffle : " + list);
		
		Collections.reverse(list);
		System.out.println("list after reverse : " +list);
		
		List<String> sublist = list.subList(0, 4);
		System.out.println("this is the sublist : " + sublist);
	}

}
