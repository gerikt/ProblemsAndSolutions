package ArrayTypeExcercises;

import java.util.Arrays;

public class Problem17 {

	public static void main(String[] args) {

		int [] arr= {1,2,3,2,3,4,5,67,7,5,43,56,3};
		
		System.out.println("original array :" + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("sorted array :" + Arrays.toString(arr));

		
		int index=arr.length-2;
		
		System.out.println("Second largest value  :" + arr[index]);

		
	}

}
