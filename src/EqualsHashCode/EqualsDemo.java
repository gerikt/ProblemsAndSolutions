package EqualsHashCode;

public class EqualsDemo {

	public static void main(String[] args) {

		Student john = new Student( 1,"John","23 east , california");
		Student john2 = new Student( 2,"John","23  east , california");
		Student john3 = new Student( 2,"John","23 east , california");

		System.out.println(john3.equals(john2));
	}

}
