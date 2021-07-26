
public abstract class Shape {

 String color;
	//constructor
	public Shape(String Color ) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	abstract public void area();
	
}
