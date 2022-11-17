package ArrayTypeExcercises;

import java.util.Arrays;

public class Problem11 {

	public static void main(String[] args) {

		int []a = {1,2,3,4,5,6,7,8,9,10};
		int [] arev=new int[10];
		
		for (int i=0; i<a.length;i++)
		{
			arev[i]=a[a.length -i-1];
		}
		
		System.out.println("the reverse is " + Arrays.toString(arev));
		
		
	}

}
