package ConditionalTypeExcercises;
import java.util.Scanner;


public class Problem1 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in );
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		if(num>0)
		{
			System.out.print("Number is positive");
			
		}
		
		else
		{
			System.out.print("Number is negative");
			
		}
	}

}
