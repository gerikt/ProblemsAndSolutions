package NestedTryCatch;

public class NestedTryCatch {

	public static void main(String[] args) {

		try {//block1
		
			try {//block2
				try {//block3
					
					int arr[] = {1,2,3,4};
					
				}
				catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println("ArrayIndexOutOfBounds Exception in block 3");
					throw e;
				}
				
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBounds Exception in block 2");
			     throw e;
			}
		} 
		catch (Exception e4)
		{
			System.out.println("ArrayIndexOutOfBoundsException in block 1 ");
			
		}
		}
	}


