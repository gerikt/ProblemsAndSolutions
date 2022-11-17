package ArrayTypeExcercises;

public class Problem13 {

	public static void main(String[] args) {

		String [] myArray= { "bcd","abd","jude","bcd","oiu","gzw"};
		
		for ( int i = 0 ; i<myArray.length-1;i++)
		{
			for(int j = 0; j<myArray.length-1;j++)
			{
				if(myArray[i].equals(myArray[j]) && (i!=j))
				{
					System.out.println("Dublicate element is " + myArray[j] );
				}
					
			}
		}
	}

}
