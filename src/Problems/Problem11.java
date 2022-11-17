package Problems;
import java.util.Scanner;


public class Problem11 {
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the radius");
		double radius=input.nextDouble();
		double per= 2*Math.PI*radius;
		System.out.println("perimeter is = "+per);
		
		double area = Math.PI* radius*radius;
		System.out.println("Area is = " +  area);
	}

}
