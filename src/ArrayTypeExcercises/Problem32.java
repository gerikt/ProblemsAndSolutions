package ArrayTypeExcercises;

public class Problem32 {

	public static void main(String[] args) {

		int [] arr= {10,25,1,44,155,156,65,77};
		int num1=65;
		int num2 =77;
		
		System.out.println("Result: "+result(arr, num1, num2));

		
	}
	
	public static boolean result ( int [] arrayNums,int num1,int num2)
	{
		for ( int number:arrayNums)
		{
			boolean r=number != num1 && number != num2;
			if(r)
			{
				return false;
			}
		}
		
		return true;
	}

}
