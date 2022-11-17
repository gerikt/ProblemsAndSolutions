package ArrayTypeExcercises;

public class Problem22 {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,6,5,4,5,6,5,4,};
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==10 && i!=j)
				{
					System.out.println("the elements added are i,j :" + i + " , " + j);
				}
			}
		}
	}

}
