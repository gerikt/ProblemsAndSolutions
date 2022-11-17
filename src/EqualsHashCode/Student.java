package EqualsHashCode;

public class Student {
	
	private int rollNumber;
	private String name;
	private String address;
	
	public Student ( int rollNumber , String name , String address)
	{
		this.rollNumber=rollNumber;
		this.address=address;
		this.name=name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals( Object obj)
	{
		if(this==obj)
			return true;
		
		
		//this checks that  the object is not null and its of the same class
		if(obj==null||obj.getClass()!=this.getClass())
			return false;
		
		//casting obj object into the student type
		Student student = (Student) obj;
		
		return (student.rollNumber==this.rollNumber);
	}
	
	
	@Override
	public int hashCode()
	{
		return this.rollNumber;
	}
	
	
}
