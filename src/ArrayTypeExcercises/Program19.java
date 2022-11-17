package ArrayTypeExcercises;

import java.util.Arrays;

public class Program19 {
public static void main (String [] args)
{

	int [] arr1 = {1,5,8,9,10,15};
	int [] arr2= {1,5,7,8,9,14};
	
	int [] arr3= new int [6]
			;
	
	for (int i=0;i<arr1.length;i++)
	{
		arr3[i]=arr1[i] +arr2[i];
	}
	
	System.out.println("the new matrix is :" +Arrays.toString(arr3));



}
}
