package Reccursion;

public class ComplexFunction {
	
	int calculateFactorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return(n*calculateFactorial(n-1));
		}
	}
	
	public static void main ( String [] args)
	{
		ComplexFunction c1 = new ComplexFunction();
		System.out.println(c1.calculateFactorial(12));
		
	}

}
