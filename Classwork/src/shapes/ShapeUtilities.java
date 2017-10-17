package shapes;

public class ShapeUtilities
{
	public static double sumPeri(Shape[] shapeArr)
	{
		double peri = 0;
		for(int i = 0; i < shapeArr.length; i++)
		{
			peri += shapeArr[i].calperi;
		}
		return peri;
	}
	public static double sumArea(Shape[] shapeArr)
	{
		double area = 0;
		for(int i = 0; i < shapeArr.length; i++)
		{
			area += shapeArr[i].calarea;
		}
		return area;
	}
}
