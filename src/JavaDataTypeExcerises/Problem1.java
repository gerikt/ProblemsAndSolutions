package JavaDataTypeExcerises;
import java.util.Scanner;

public class Problem1 {
	//Convert temperature from Farenheit to Celcius

	public static void main(String[] args) {

		Scanner input = new Scanner ( System.in);
		System.out.println("Enter the temeprature in Farenheit");
		double far= input.nextDouble();
		
		double cel = (5*(far-32))/9;
		
		System.out.println("the temprature in celsius is : " + cel);
		
	}

}
