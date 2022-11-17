package ArrayTypeExcercises;

public class Problem5 {
	
	public static boolean contains(int [] array1 , int item)
	{
		for (int i: array1)
		{
			if(item==i)
			{
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		int [] arr= {1235,4856,1578,1526,
				1254,1258,3654,1523,1258,
				1547,1125,1445,1255,1266};
		
		System.out.println(contains(arr,1235));
		
		}
	}


