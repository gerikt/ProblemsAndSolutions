package Sorting;
import java.util.*;

public class Problem1 {
	private int tempArray[];
	private int len;
	
	public void sort ( int [] nums)
	{
		if(nums == null || nums.length==0)
		{
			return;
		}
		
		this.tempArray=nums;
		len=nums.length;
		quickSort(0,len-1);
	}
	
	private void quickSort(int lowIndex , int highIndex)
	{
		int i = lowIndex;
		int j = highIndex;
		
		//calculate pivot number
		int pivot = tempArray[lowIndex + (highIndex - lowIndex)/2];
		
		//devide in two arrays 
		while(i<=j)
		{
			while(tempArray[i]<pivot)
			{
				i++;
			}
			while(tempArray[i]>pivot)
			{
				j--;
			}
			
			if(i<=j)
			{
				exchangeNumbers(i,j);
				i++;
				j--;
				
			}
		}
		
		if(lowIndex<j)
			quickSort(lowIndex,j);
			if(i<highIndex)
				quickSort(i,highIndex);
	}
	
	private void exchangeNumbers(int i , int j )
	{
		int temp = tempArray[i];
		tempArray[i]=tempArray[j];
		tempArray[j]=temp;
		
	}

	public static void main(String[] args) {

        Problem1 ob = new Problem1();
		int nums [] = {7,-5,3,2,1,0,45};
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(nums));
		ob.sort(nums);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(nums));
		
	}

}
