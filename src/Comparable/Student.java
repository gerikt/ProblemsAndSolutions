package Comparable;

public class Student implements Comparable<Student> {
	
	private int age;
	private int rollNumber;
	private String name;
	
	public Student ( int rollNumber,String name , int age)
	{
		this.age=age;
		this.name=name;
		this.rollNumber=rollNumber;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Student student)
	{
		return this.rollNumber - student.rollNumber;
	}
	
}
