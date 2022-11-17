package Problems;
import java.util.Scanner;

public class Problems15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int z;
		System.out.println("Enter value of x");
		int x=input.nextInt();
		
		System.out.println("Enter value of y");
		int y=input.nextInt();
		
		z=x;
		x=y;
		y=z;
		
		System.out.println("the value of x = " + x + " and the value of y = " + y);
		

	}

}
