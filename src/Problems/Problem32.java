package Problems;
import java.util.Scanner;
public class Problem32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner ( System.in);
		
		System.out.println("Enter the first number : " );
		int num1 = input.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = input.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Num 1 > num2");
			
		}
		
		else if (num1<num2)
		{
			System.out.println("Num 1 < num2");
			
		}
		else
		{
			System.out.println("Num 1 = num2");

		}
		
		
	}

}
