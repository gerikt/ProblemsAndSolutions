package TuesdayNovEighth;

public class Employee {

	double salary;
	
	void getPaid()
	{
		System.out.println("The salary is : " + salary);
		
	}
	
	
	
}

class Contractor extends Employee
{
	double hourlyRate;
	
	@Override
	void getPaid()
	{
		System.out.println("the contraactor hourly ra is : " + hourlyRate);
	}
	}

class FullTimeEmployee extends Employee
{
	
	}