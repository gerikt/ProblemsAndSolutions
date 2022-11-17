package JavaDataTypeExcerises;
import java.util.Scanner;


public class Problem2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length in inches :");
		double lengthInches=input.nextDouble();
		double meters= (lengthInches/39.37);
		System.out.println("the length in meters is :" + meters);
		
	}

}
