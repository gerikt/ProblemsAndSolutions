package CollectionTypeExcercises2;

import java.util.*;

public class Problem10 {

	public static void main(String[] args) {

		LinkedList<String> c = new LinkedList<String>();
		c.add("first");
		c.add("second");
		c.add("third");
		c.add("fourth");
		c.add("last");

		System.out.println("list : " + c);

		Object firstElement = c.getFirst();

		System.out.println("original list is : " + c);

		System.out.println(" first element is : " + firstElement);

		Object lastElement = c.getLast();

		System.out.println(" the last element is : " + lastElement);

		for( int p =0 ; p<c.size(); p++)
		{
			System.out.println("element at index : " + p +" "+ c.get(p));
		}
		
		c.remove(2);
		System.out.println("fter removing element 2 : " + c);
	
		c.removeFirst();
		c.removeLast();
		
		System.out.println(" after removing elements is : " + c);
	
		c.removeAll(c);
		System.out.println(" after removing all elements is : " + c);

		c.add("first");
		c.add("second");
		c.add("third");
		c.add("fourth");
		c.add("last");
		
		System.out.println(c);
		
		Collections.swap(c, 0, 4);
		System.out.println(c);
		Collections.shuffle(c);
		System.out.println(c);

		LinkedList<String> c1 = new LinkedList<String>();
		
		c1.add("ten");
		c1.add("twenty");
		c1.add("thirty");
		c1.add("forty");
		
		c.addAll(c1);
		
		System.out.println(c);
		
		LinkedList<String> newc1 = new LinkedList<String>();
		newc1=(LinkedList)c1.clone();
		
		System.out.println("cloned linkedlist is : " + newc1);

		//remove first element 
		c.pop();
		System.out.println("after removing first element ( pop )  " + c);

		c.peekFirst();
		System.out.println("after peek " + c.peekFirst());
	
		System.out.println("after peek last " + c.peekLast());

		if(c.contains("ten"))
		{
			System.out.println("ten is present");
		}
		else
		{
			System.out.println("ten is not present in the list");
			}
		}

}
