package Problems;

import java.util.Scanner;

public class Problem3 {
	public static void main(String [] args)
	{
	
	Scanner input = new Scanner(System.in);
	System.out.println("enter the first number");
	int num1= input.nextInt();
	System.out.println("Enter the second number");
	int num2 = input.nextInt();
	int result=num1/num2;
	System.out.println("result is = " +result);

}
}