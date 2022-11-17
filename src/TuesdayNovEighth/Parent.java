package TuesdayNovEighth;

public class Parent {
	
	Parent()
	{
		System.out.println("Parent class constructor");
	}
	
	void hello()
	{
		System.out.println("Hello from parent class");
	}
	void buy()
	{
		System.out.println("buy from the parent class");
	}
	

}

class Child extends Parent
{
	 Child()
	{
		System.out.println("Child class constructor");
	}
	@Override
	void hello()
	{
		System.out.println("Hello from child class");
	}
	@Override
	void buy()
	{
		System.out.println("buy from the child class");
	}
	

	}
