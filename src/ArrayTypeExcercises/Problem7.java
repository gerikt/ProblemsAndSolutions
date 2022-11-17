package ArrayTypeExcercises;

import java.util.Arrays;

public class Problem7 {

	public static void main(String[] args) {

		int [] my_array= {1,2,4,3,2,4,5,34,23,43,23};
		System.out.println("Original Array :" + Arrays.toString(my_array));
		
		int removeIndex=6;
		
		for(int i= removeIndex;i<my_array.length-1;i++)
			my_array[i]=my_array[i+1];
		
		System.out.println("After removing the second element :" +Arrays.toString(my_array));
		
	}

}
