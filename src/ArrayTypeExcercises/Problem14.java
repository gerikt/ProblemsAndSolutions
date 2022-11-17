package ArrayTypeExcercises;

public class Problem14 {

	public static void main(String[] args) {

		String [] arr1 = {"abs","cdma","gsm","usb","asa","mun"};
		String [] arr2 = {"abs","uni","ucf","ult","iln","asa","ut","mun"};
		
	
		for(int i=0;i<arr1.length;i++)
		{
			for(int j = 0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]) )
				{
					System.out.println("the dublicate element is : " + arr1[i]);
				}
			}
		}
			}
		
	

}
