package ArrayTypeExcercises;

import java.lang.reflect.Array;

public class Problem26 {

	public static void main(String[] args) {

		int [] arrayNums= {0,0,1,0,3,0,5,0,6};
		int i =0;
		System.out.println("Original array is :");
		for ( int n : arrayNums)
		{
			System.out.print(n + "  ");
			
		}
		
		for ( int j=0, l= arrayNums.length; j<l;)
		{
			if(arrayNums[j]==0)
				{j++;
				
				}
			else {
				int temp = arrayNums[i];
				arrayNums[i]=arrayNums[j];
				arrayNums[j]=temp;
				i++;
				j++;
				
			}
			
		}
		while (i<arrayNums.length)
			arrayNums[i++]=0;
		System.out.println("\n after moving the zeros to the end");
		for(int n : arrayNums)
			System.out.print(n + "  ");
		
	}

}
