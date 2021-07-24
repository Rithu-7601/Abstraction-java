
public class Rectangle extends Shape {

	
	int length,  breadth;
	
	public Rectangle(String Color, int length, int breadth) {
		super(Color);
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public void area() {
		System.out.println("Area of Rectangle = "+(this.length * this.breadth));
	}
}
