package ExceptionHandling;
import java.util.*;
import java.util.ArrayList;
public class WriterHelper {
	public void writeList()
	{
	try
	{
		List <Integer> list = new ArrayList<>(10);
		list.add(10);
		
		System.out.println("Entering " + " try statement");
		Integer a = list.get(1);
		System.out.println("accessing the first element: " + a);
		
		
	} 
	catch(IndexOutOfBoundsException e)
	{
		System.err.println("Caught IndexOutOfBoundsException : " + e.getMessage());
	}finally
	{
		System.out.println("this will always be executed");
	}

}
}