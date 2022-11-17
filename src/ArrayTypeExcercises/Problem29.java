package ArrayTypeExcercises;

public class Problem29 {

	public static void main(String[] args) {

		int [] arr = { 1,2,3,4,5,3,2,2,4,5,5,3,2,3,411};
		
		int min=arr[0];
		int max=arr[0];
		int sum=0;
		
		for (int i=0;i<arr.length;i++)
		{
			
			sum +=arr[i];
			
			if ( arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		
		float x = sum- min - max;
		System.out.println(" the average without min and max is : " + x);
	}

}
