package ArrayTypeExcercises;

public class Problem31 {

	public static void main(String[] args) {

		int [] arr = {10,10,10,2,3,4,5,4,10};
		int searchNum=10;
		int fixedSum=30;
		
		System.out.println("Result : " + result(arr,searchNum,fixedSum)  );
		
		
	
		
	}
	
	public static boolean result(int [] numbers,int searchNum,int fixedSum)
	{
		int tempSum=0;
		for ( int number : numbers)
		{
			if(number ==searchNum)
			{
				tempSum+=searchNum;
			}
			
			if(tempSum>fixedSum)
			{
				break;
			}
		}
		
		return tempSum==fixedSum;
		
	}

}
