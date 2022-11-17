package epanalipsi;

import java.util.Arrays;

public class Problem7 {

	public static void main(String[] args) {

		int [] myArray = { 24,25,2,4,56,78,98,4};
		
		System.out.println("Original array is  : " + Arrays.toString(myArray));
		
		//remove the second element 
		int removeIndex=1;
		
		for ( int i = removeIndex;i<myArray.length-1;i++)
		{
			myArray[i]=myArray[i+1];
			
		}
	    System.out.println("After removing the second element: "+Arrays.toString(myArray));

	}

}
