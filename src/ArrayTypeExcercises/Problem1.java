package ArrayTypeExcercises;
import java.util.Arrays;
public class Problem1 {

	public static void main(String[] args) {

		int [] my_array1= {
				1789,2035,1563,5489,7456,1565,
				1547,3654,4856,1566,5889,4578};
		
		String [] my_array2= {
				"Java",
				"Python",
				"php","c","c++"
				};
		System.out.println("Original numeric array :" + Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numerical array :" + Arrays.toString(my_array1));
		
		System.out.println("Original string array :" + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
		System.out.println("sorted string array :" + Arrays.toString(my_array2));

		
	}

}
