package CollectionTypeExcercises;
import java.util.*;

public class Problem9 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList <String>();
		List<String> list2 = new ArrayList <String>();

		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("6");
		list1.add("5");
		
		System.out.println("the list 1 is :" + list1);
		
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		list2.add("F");
		
		System.out.println("the list 2 is :" + list2);
		
		Collections.copy(list1,list2);
		
		System.out.println("After copy :");
		System.out.println("list1 : " +list1);
		System.out.println("list 2 :" + list2);

	}

}
