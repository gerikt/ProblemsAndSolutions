package ArrayTypeExcercises;

public class Problem10 {

	public static void main(String[] args) {

		int [] a = {1,2,3,4,5,6,78,9,10};
		int amax=0;
		int amin=100000000;
		
		
		for (int i =0; i<a.length;i++)
		{
			
			if(a[i]>amax)
			{
				amax=a[i];
			}
			
			if (amin>a[i])
			{
				amin=a[i];
			}
		}
		
		System.out.println("the min is " + amin);
		System.out.println(" the max is " + amax);
		
	}

}
