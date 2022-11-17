package ArrayTypeExcercises;

public class Problem25 {
public static void main (String [] args)
{

	int [] arr1 = {1,2,3,4,5,6};
	int [] arr2 = {1,2,3,4,5,6};
	int [] arr3 = {1,23,42,34,5,2};
	
	for(int i = 0; i<arr1.length;i++)
	{
		for(int j =0;j<arr2.length;j++)
		{
			for(int k=0;k<arr3.length;k++ )
			{
				if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
				{
					System.out.println(" the common element is at index :" + i + " and has the value :" + arr1[i]);
				}
			}
		}
	}

}
}
