package Problems;

public class Problem38 {

	public static void main(String[] args) {

		String test = "I will start learning java in 32 weeks from and"
				+ " i will be making 58756 dollars a month% ";
		count(test);
		
		
	}
	
	public static void count ( String x)
	{
		char [] ch = x.toCharArray();
		int letter = 0;
		int space=0;
		int num= 0;
		int other = 0;
		
		for (int i=0; i< x.length();i++)
		{
			if (Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if (Character.isDigit(ch[i]))
			{
				num++;
			}
			else if (Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			
			else
			{
				other++;
			}
		}
		
		System.out.println("the string is sdfsdgr");
		System.out.println("letter : "+ letter);
		System.out.println("number : " + space);
		System.out.println("space : " + num);
		System.out.println("other : " + other);

	}

}
