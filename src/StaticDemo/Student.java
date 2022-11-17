package StaticDemo;

public class Student {
	private String name;
	private int age;
	private String address;
	static String college = " XYZ";
	static int count =0;
	
	public Student(String name,String address,int age)
	{
		this.address=address;
		this.name=name;
		this.age=age;
		
	}
	
	public static void StudentCount()
	{
		count+=1;
	}
	
	int getCount()
	{
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return("Student name is : " + name + " ,age is :" + age + " and address is : " + address);
	}
	

}
