package Problems;
import java.nio.charset.Charset;

public class Problem40 {

	public static void main(String[] args) {
		
		int i =0;

		System.out.println("List of available character sets: ");
		for (String str : Charset.availableCharsets().keySet())
		{
			System.out.println(str);
			i++;
			System.out.println("count is : " + i);
		}
		
	}

}
