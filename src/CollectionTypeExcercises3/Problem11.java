package CollectionTypeExcercises3;
import java.util.*;

public class Problem11 {

	//which elements are on both sets 
	public static void main(String[] args) {

		HashSet <String> set1 = new HashSet<String>();
		
		set1.add("Red");
		set1.add("blue");
		set1.add("dssd");
		
		System.out.println(" first hashSet content is : " + set1);
	
		HashSet<String> set2 = new HashSet<String>();
		
		set2.add("green");
		set2.add("blue");
		set2.add("dssd");
		
		System.out.println(" second hashset content is : " + set2);
		
		set1.retainAll(set2);
		System.out.println(" HashSet content : ");
		System.out.println(set1);
	
		//write a java program to remove all the elements of a set
		
		set1.removeAll(set1);
		System.out.println(set1);
	}

}
