package shapes;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}

	@Override
	public String toString()
	{		
		return "This sqare's side length is "+ side + ". And it has an area of " + this.calculateArea() + " with a perimeter of " + this.calculatePerimeter() + "." ;
	}

}
