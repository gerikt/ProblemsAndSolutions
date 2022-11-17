package ArrayTypeExcercises;

import java.util.Arrays;

public class Problem16 {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,67,8,9,9,0,90};
		
		for (int i=0; i<arr.length;i++)
		{
			for ( int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&& (i!=j))
				{
					System.out.println("the duplicate element is : " + i);
				    int removeIndex= i;
				    
				    for(int k = removeIndex;k<arr.length-1;k++)
				    {
				    	arr[k]=arr[k+1];
				    }
					
				}
			}
		}
		
		System.out.println("the new array is"+ Arrays.toString(arr));
	}

}
