package ArrayTypeExcercises;
import java.util.Scanner;
import java.util.Arrays;

public class Problem9 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Enter the index position");
		
		int indexPosition= input.nextInt();
		System.out.println("Enter the value");
		int newValue=input.nextInt();
		
		System.out.println("original array " + arr);
		
		for (int i = arr.length-1; i> indexPosition; i--)
		{
		       arr[i]=arr[i-1];
	}
		
		arr[indexPosition]=newValue;
		
		System.out.println("new array : " + Arrays.toString(arr));
	}
}
