package TuesdayNovEighth;
import java.util.*;
public class Homework2 {
	
	static void info()
	{
		System.out.println("today is tuesday");
	}

	
	static void info(String day)
	{
		System.out.println("today is  " + day);
	}
	
	static void info(String day, int month)
	{
		System.out.println("today is : " + day + "month is : " + month);
	}
	static void info(String [] arr1)
	{
		System.out.println("today is  " + arr1[0] + " and tommorow is : " + arr1[1]);
	}
	
	public static void main(String[] args) {

		info();
		info("tursday");
		info("tuesday,3");
		String [] arr1= { "Monday","tuesday","wednesday"};
		info(arr1);
	}

}
