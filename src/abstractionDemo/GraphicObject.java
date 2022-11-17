package abstractionDemo;

public abstract class GraphicObject {
 int x,y;
 
 void moveTo(int newX,int newY)
 {
	 System.out.println("Drawing a circle");
 }
 
 abstract void draw();
 abstract void resize();
}

class Circle extends GraphicObject
{
	@Override
	void draw()
	{
		System.out.println("draw circle");
	}
	
	@Override
	void resize()
	{
		System.out.println("resize circle");
	}
	}

class Rectangle extends GraphicObject
{

	@Override
	void draw() {
		System.out.println("Draw rectangle");
		
	}

	@Override
	void resize() {
		System.out.println( " resize a rectangle");
		
	}
	
	}
