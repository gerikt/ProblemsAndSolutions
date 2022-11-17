package Problems;
import java.io.Console;

public class Problem42 {

	public static void main(String[] args) {
		Console cons ; 
		if((cons = System.console()) !=null)
		{
			char [] pass_ward = null;
			try {
				pass_ward = cons.readPassword("Input your password :");
				System.out.println("Your password was " + new String(pass_ward) );
			}
			finally
			{
				if(pass_ward != null)
				{
					java.util.Arrays.fill(pass_ward,' ');
				}
			}
		} else
		{
			throw new RuntimeException ( " cant get password... no console");
			
		}

	}

}
