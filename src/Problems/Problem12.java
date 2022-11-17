package Problems;
import java.util.Scanner;

public class Problem12 {

	public static void main ( String [] args)
	{
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the first number");
		int num1=input.nextInt();
				
		System.out.println("Enter the second number");
		int num2=input.nextInt();

		System.out.println("Enter the third number");
		int num3=input.nextInt();
		
		int sum = num1+num2+num3;
		
		System.out.println("the average of the numbers : " 
				+ (num1) + " and " + (num2) + " and " +(num3) + " is : " + (sum/3) );


	}
}
