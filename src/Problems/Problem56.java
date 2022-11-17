package Problems;
import java.util.Scanner;


public class Problem56 {
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  first number");
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		System.out.println("Enter the factor p");
		int p = input.nextInt();
		int count=0;
		
		for(int i= num1;i<=num2;i++)
		{
			
			if(i%p==0)
			{
				System.out.print(i + " ,");
			 count++;
				
			}
		}
		
		System.out.println("the count is :" + count);
	}

}
