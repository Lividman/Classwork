package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	// fields
	private double radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// to be implemented by student
		return((radius * radius)* pi);
	}

	@Override
	public double calculatePerimeter() {
		// to be implemented by student
		return( 2 * radius * pi);
	}

	@Override
	public String toString() {
		return "This Circle has a radius of "+radius+ " It has an Area of " + this.calculateArea() + " and a perimeter of " + this.calculatePerimeter() + ".";
	}
}
