package CollectionTypeExcercises;
import java.util.*;

public class Problem19 {

	public static void main(String[] args) {

		ArrayList <String> c1 =new ArrayList<String>();
		 c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
		
         c1.trimToSize();
         System.out.println(c1);
         
         //increase capacity to 7 
         c1.ensureCapacity(7);
         
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         
         System.out.println(c1);

         //replace specified element of an ArrayList with the specified element
         c1.set(1, "dsfsdfsdfsd");
         System.out.println("FTER REPLACEMENT IS " +c1);
         
         for(int i= 0; i<c1.size();i++)
         {
        	 System.out.println("at position i =" + i + " is value : "+ c1.get(i));
         }
         

	}

}
