package shapes;

public class Circle implements Shape
{
	double radius;
	private static double pi = 3.14;
	public Circle (double rad)
	{
		radius = rad;
	}
	public double calperi(double rad)
	{
	return (2 *(rad * pi));	
	}
	public double area(double rad)
	{
		return((rad * rad)* pi);
	}
}
