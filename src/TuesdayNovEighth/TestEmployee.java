package TuesdayNovEighth;

public class TestEmployee {

	public static void main(String[] args) {

		Employee c1 = new Employee();
		c1.salary=8000;
		c1.getPaid();
		
		System.out.println("----------------");
		
		Contractor c2 = new Contractor();
		c2.hourlyRate=10000;
		c2.getPaid();
		
		System.out.println("----------------");

		FullTimeEmployee c3 = new FullTimeEmployee();
		
		
	}

}
