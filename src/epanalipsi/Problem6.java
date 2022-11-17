package epanalipsi;

public class Problem6 {

	public static int findIndex(int [] myArray, int t)
	{
		if(myArray==null)
		{
			return -1;
			
		}
		int len = myArray.length;
		int i=0;
		
		while (i<len)
		{
			if(myArray[i]==t)
				return i;
			
			else
				i+=1;
		}
		return-1;
		
		
	}
	public static void main(String[] args) {

		int [] myArray = {23,4,56,78,97,65,43,6,25};
		System.out.println("Index position of 25 is : " + findIndex(myArray,25));
		System.out.println("Index position of 4 is : " + findIndex(myArray,4));

	}

}
