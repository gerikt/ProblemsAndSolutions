package epanalipsi;

public class Problem5 {

	
	public static boolean contains ( int [] arr, int item )
	{
		for ( int n : arr)
		{
			 if ( item ==n)
			 {
				 return true;
				 
			 }
		}
		return false;
	}
	
	public static void main(String[] args) {

		int [] arr = { 1233,2334,2122,34455,22243,4543,432};
		
		System.out.println(contains(arr,2122));
		
		
	}

}
