package JavaDataTypeExcerises;
import java.util.Scanner;
//adds the digits for num between 1 and 1000

public class Problem3 {
	public static void main (String [] args)
	{
		Scanner input = new Scanner ( System.in);
		System.out.println("Enter a number between 1 and 1000");
		int num= input.nextInt();
		int dig3=num%10;
		
		int res= num/10;
		int dig2=res%10;
		
		int dig1=num/100;
		
		int endRes = dig1 +dig2+dig3;
		System.out.println("The added digits are :" + endRes );
		
		
				
	}

	
}
