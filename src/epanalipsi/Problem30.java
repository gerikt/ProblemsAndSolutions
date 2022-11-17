package epanalipsi;

public class Problem30 {
	public static void main(String[] args) {

		int [] arr = { 2,3,4,5,3,244,56,54};
		int max=0;
		int min=144444;
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
		}
		
		
		System.out.println("the max is : " + max);
		System.out.println("the min is : " + min);
	}

}
