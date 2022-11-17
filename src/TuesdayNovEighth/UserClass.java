package TuesdayNovEighth;

public class UserClass {

	String name;
	long mobileNumber;
	
	
	UserClass()
	{
		
	}
	
	

	public UserClass(String name, long mobileNumber) {
	
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
}

class UserInfo extends UserClass
{
	String userAddress;
	
	UserInfo(String name,int mobileNumber,String userAddress)
	{
		super();
		this.userAddress=userAddress;
		
	}
	
	void userDetails()
	{
		System.out.println("User details :");
		System.out.println("name is " + super.name);
		System.out.println("Mobile is " + mobileNumber);
		System.out.println("the adress is " + userAddress);
	}
	}