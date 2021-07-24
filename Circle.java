
public class Circle extends Shape {

	float radius;
	
	
	public Circle(String Color, float radius)  {
		super(Color);
		this.radius = radius;
	}


	@Override
	public void area() {
	
	System.out.println("area of a circle = "+(float)(Math.PI*Math.pow(radius, 2)));

	}

}
