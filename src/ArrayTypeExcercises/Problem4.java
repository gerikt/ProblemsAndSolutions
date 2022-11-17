package ArrayTypeExcercises;

public class Problem4 {

	public static void main(String[] args) {

		int [] arr= {1,2,3,5,8,7,4,5,6,92};
		int sum=0;
		int ave;
		
		for(int i:arr)
		{
			sum+=i;
		}
		
		ave=sum/arr.length;
		
		System.out.println("the average is " + ave);
		
	}

}
