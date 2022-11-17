package ArrayTypeExcercises;


import java.util.Arrays;

public class Problem8 {

	public static void main(String[] args) {

		int [] a= {1,2,3,4,2,3,4,5,4,2,3,4};
		int [] b= new int [12];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println(Arrays.toString(b));
	}

}
