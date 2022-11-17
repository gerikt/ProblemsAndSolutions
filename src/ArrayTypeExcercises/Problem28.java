package ArrayTypeExcercises;

public class Problem28 {

	public static void main(String[] args) {

		int [] arr = {2,1,4,5,6,2,1,5,8,44,7,6,45,45,6,998,};
		
		int min=55555555;
		int max=0;
		
		for (int i=0; i<arr.length;i++)
		{
			if ( arr[i]<min)
			{
				min=arr[i];
			}
			
			if ( arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("the difference between the bigest and the smallest is : " + ( max - min ) );
	}

}
