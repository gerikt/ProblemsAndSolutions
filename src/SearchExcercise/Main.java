package SearchExcercise;

public class Main {
	
	
	public static int binarySearch ( int [] nums , int flag)
	{
		int hinum=nums.length-1;
		int lonum=0;
		
		while(hinum>=lonum)
		{
			int guess = (lonum + hinum)>>>1;
			
			if(nums[guess]>flag)
			{
				hinum=guess-1;
				
			}
			else if (nums[guess]< flag)
			{
				lonum=guess+1;
			}
			else
			{
				return guess;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {

		int [] nums = {1,5,6,7,8,11};
		int searchnum = 7;
		int index = binarySearch(nums,searchnum);
		if(index==-1)
		{
			System.out.println(searchnum+" is not in the array ");
			
		}else
		{
			System.out.println(searchnum + " is at index : " + index);
		}
		
	}

}
