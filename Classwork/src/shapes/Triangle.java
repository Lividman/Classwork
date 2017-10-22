package shapes;

public class Triangle implements Shape {

	private int side;

	public Triangle(int side)
	{
		this.side = side;
	}
	public double calculateArea()
	{
		// To be written by student
		return ((Math.sqrt(3) / 4) * (side * side) );
	}
	public double calculatePerimeter()
	{
		return(3 * side);
	}
	public String toString()
	{
		return "Triangle side length: " + side + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}

}
