package CollectionTypeExcercises;
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;


public class Problem16 {

	public static void main(String[] args) {

		ArrayList<String> c1= new ArrayList<String>();
		c1.add("sdddf");
		c1.add("adad");
		c1.add("adds");
		c1.add("sssd");
		c1.add("dsds");
		
		System.out.println("original array list" + c1);
		ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
	
		System.out.println("Cloned array list " + newc1);
	
	}

}
