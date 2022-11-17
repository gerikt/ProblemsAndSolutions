package ArrayTypeExcercises;



public class Problem2 {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,3,4,5,6};
		int sum=0;
		
		for (int i : arr)
			sum+=i;
		System.out.println("the sum is :" + sum);
		
	}

}
