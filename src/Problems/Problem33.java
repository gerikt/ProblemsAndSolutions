package Problems;
import java.util.Scanner;

public class Problem33 {
	
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer");
		long n = input.nextLong();
		System.out.println(sumDigits(n));
	}
	
	
	public static int sumDigits(long n)
	{
		int sum=0;
		while( n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

}
