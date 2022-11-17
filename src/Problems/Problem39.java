package Problems;

public class Problem39 {

	public static void main(String[] args) {

		int count =0 ;
		
		for(int i =0; i<5 ; i++)
		{
			for(int j=0; j<5; j++)
			{
				for(int k=0; k <5 ; k++)
				{
					count ++;
					System.out.println(i + " " + j + " " + k );
				}
			}
		}
		
		System.out.print("Total number of the three digit number is : " + count);
		
		
		
	}

}
