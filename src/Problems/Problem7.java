package Problems;
import java.util.Scanner;

public class Problem7 {

	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first number");
		int num =input.nextInt();
		 
		 for(int i =0;i<11;i++)
		 {
		 System.out.println(num + " x " + i +" = " + (i*num) );
		 }
	}
}
