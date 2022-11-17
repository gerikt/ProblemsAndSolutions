package TuesdayNovEighth;

public class Shape {

	int radius;

	public Shape(int radius) {
		this.radius = radius;
	}
	
	

}

class Circle extends Shape {
	
	

	Circle(int radius) {
		super(radius);

	}

	void calculateArea() {
		System.out.println("the area of the circle is : " + Math.PI * radius * radius);
	}

}
