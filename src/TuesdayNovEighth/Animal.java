package TuesdayNovEighth;

public class Animal {

	public void eat()
	{
		System.out.println("all animals eat");
		
	}

	public void sleep()
	{
		System.out.println("all animals sleep");
	}

}

class Tiger extends Animal
{
	@Override
	
	public void eat()
	{
		System.out.println("tiger eat human");
	}
	
	public void run()
	{
		System.out.println("tigers can run fast");
	}
	
	}
