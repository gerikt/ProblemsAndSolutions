package ArrayTypeExcercises;

public class Problem27 {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,7,8,9,6,5,4,3,5,5};
		int even=0;
		int odd=0;
		
		for( int i =0 ; i< arr.length;i++)
		{
			if ( arr[i]%2==0)
			{
				even++;;
			}
			
			else
			{
				odd++;
			}
		}
		
		System.out.println("Number of even is : " + even + " number of odd is : " + odd);
	}

}
