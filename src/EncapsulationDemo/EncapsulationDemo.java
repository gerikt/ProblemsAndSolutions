package EncapsulationDemo;

public class EncapsulationDemo {

	public static void main(String[] args) {

		Student John = new Student("john","California",23);
		System.out.println(John.toString());
		System.out.println(John.getAddress());
	}

}
