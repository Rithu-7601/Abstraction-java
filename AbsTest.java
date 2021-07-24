
public class AbsTest {

	public static void main(String[] args) {
		
		//Shape s = new Shape(); //cannot instatntiate the type shape
		
		Shape s = null;
		
		s = new Rectangle("Blue",2,4);
		
		s.setColor("Red");
		System.out.println("Color = "+ s.getColor());
		s.area();
		
		s = new Circle("Green",5.5f);
		s.area();
		
		s = new Triangle("Yellow",4,4);
		s.area();
		
		

	}

}
