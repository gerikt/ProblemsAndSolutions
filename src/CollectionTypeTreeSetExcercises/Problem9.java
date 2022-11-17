package CollectionTypeTreeSetExcercises;
import java. util.*;

public class Problem9 {

	public static void main(String[] args) {

		TreeSet<Integer> c1= new TreeSet<Integer>();
		TreeSet<Integer> treeheadset = new TreeSet<Integer>();
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		c1.add(6);
		c1.add(7);
		c1.add(8);
		
		//find numbers less than 7
		treeheadset= (TreeSet)c1.headSet(7);
		
		//create an iterator 
		Iterator iterator;
		iterator = treeheadset.iterator();
		
		System.out.println("Tree set data : ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		
	}

}
