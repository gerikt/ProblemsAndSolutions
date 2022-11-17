package TuesdayNovEighth;

public class TestParent {

	public static void main (String [] args)
	{
		Parent p1 = new Parent();
		p1.hello();
		p1.buy();
		
		Child c1 = new Child();
		c1.hello();
		c1.buy();
	}
}
