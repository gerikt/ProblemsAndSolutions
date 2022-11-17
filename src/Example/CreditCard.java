package Example;

public class CreditCard {

	int balance;
	int interest;
	int time;

	public void calculateInterest() {
		System.out.println("the interest is " + (interest * time));
	}
}

class Master extends CreditCard
{
	public void calculateInterest()
	{
		
	}
	
	}
