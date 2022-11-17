package abstractionDemo;

public class AbstrDemo {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		c.resize();
		c.moveTo(23, 8);
		c.draw();
		
		r.draw();
		r.moveTo(2, 9);
		r.resize();
		
		GraphicObject g = new Circle();
		g.draw();
		//GraphicObject go = new GraphicObject();
		//not allowed with abstract classes
	}

}
