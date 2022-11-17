package CollectionTypeTreeSetExcercises;
import java.util.*;

public class Problem10 {

	public static void main(String[] args) {

		TreeSet<Integer> treenum = new TreeSet<Integer>();
		TreeSet<Integer> treeheadset = new TreeSet<Integer>();
		
		treenum.add(10);
		treenum.add(22);
		treenum.add(36);
		treenum.add(25);
		treenum.add(16);
		treenum.add(70);
		treenum.add(82);
		treenum.add(89);
		treenum.add(14);
		
		System.out.println("greater than or equal to 86 : " + treenum.ceiling(86));
	
		System.out.println("greater than or equal to 29 :" + treenum.ceiling(29));
		
	}

}
