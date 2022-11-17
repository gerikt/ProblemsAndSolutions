package Problems;
import java.util.Scanner;


public class Problem49 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num1=input.nextInt();
		
		if ( num1%2==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println(0);
		}
	}

}
