package CollectionTypeExcercises;

import java.util.ArrayList;

public class Problem17 {

	public static void main(String[] args) {

		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("black");
		c1.add("white");
		c1.add("pink");
		
		System.out.println("original array list : " + c1);
		
		c1.removeAll(c1);
		
		System.out.println("Array list after remove all elements " + c1);
		
		System.out.println("check if the list is empty :" + c1.isEmpty());
	}

}
