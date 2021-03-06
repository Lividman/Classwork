package shapes;

import java.util.Random;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */

public class ShapeUtilities {

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(5);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Circle(rand.nextInt(100));
		case 4: 
			return new Triangle(rand.nextInt(100));
		default:
			return new Parallelogram(rand.nextInt(50), rand.nextInt(50));
		}

	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapearr)
	{
			double total = 0;
			for(int count = 0; count < shapearr.length; count++) {
				total += shapearr[count].calculateArea();
			}
			return total;
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapearr)
	{
		double total = 0;
		for(int count = 0; count < shapearr.length; count++) {
			total += shapearr[count].calculateArea();
		}
		return total;
		
	}

}
