
public class Triangle extends Shape {
	
	int length, breadth;

	public Triangle(String Color, int length, int breadth) {
		super(Color);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("Area of a triangle= "+(this.length*this.breadth)/2);

	}

}
