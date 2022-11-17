package ArrayTypeExcercises;

import java.util.Arrays;

public class Problem30 {

	public static void main(String[] args) {

		int [] arr= {45,34,56,76,44};
		System.out.println("Original array is : " + Arrays.toString(arr));
		System.out.println(" Result :" + test(arr));
		
	}
	
	public static boolean test (int [] numbers)
	{
		for (int number : numbers)
		{
			if(number == 0 || number == -1)
			{
				return false;
			}
		}
		return true;
	}

}
