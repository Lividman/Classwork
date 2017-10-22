package shapes;

public class Parallelogram extends Rectangle {

	int sidea;
	int sideb;

	public Parallelogram(int sidea, int sideb) {
		super(side, side);
		this.sidea = sidea;
		this.sideb = sideb;
	}

	@Override
	public String toString()
	{		
		return "This Parallelogram's side lengths are "+ sidea + " and " + sideb + ". And it has an area of " + this.calculateArea() + " with a perimeter of " + this.calculatePerimeter() + "." ;
	}

}
