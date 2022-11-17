package CollectionTypeExcercises;
import java.util.*;


public class Problem15 {
	public static void main ( String [] args)
	{
		List<String> c1 = new ArrayList<String>();
		List<String> c2 = new ArrayList<String>();
		
		c1.add("Red");
		c1.add("blue");
	    c1.add("black");
	    
	    c2.add("gji");
	    c2.add("add");
	    c2.add("addf");
	    
	    System.out.println("the list 1 " + c1);
	    System.out.println("the lsit 2 is :" +c2);
	    
	    //lets join the two lists
	    
	    ArrayList<String> a = new ArrayList<String>();
	    a.addAll(c1);
	    a.addAll(c2);
	    
	    System.out.println("the new lisst is " + a);
	    
	    
	    
	}

}
