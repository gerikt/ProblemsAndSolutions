package epanalipsi;

public class Problem2 {

	public static void main(String[] args) {

		int sum =0;
		
		int [] arr= {1,2,3,4,5,5,67,7,8,8,9};
		
		for(int i=0; i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("the sum is : " + sum);
		
		System.out.println("the average is " + sum/arr.length);
	
		int testValue = 10;
		
		for (int i =0; i< arr.length;i++)
		{
			if ( arr[i]==testValue)
			{
				System.out.println("Test value found ");
				break;
			}
			else 
			{
				System.out.println("test value not found in the array ");
				
				
			}
		}
	
	}

}
