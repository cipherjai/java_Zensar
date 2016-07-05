class Circle
{
	
	//Declaring instance variable
	private double circleRadius;

	//Declaring class variable
	private static int count;

	public Circle() //default constructor
	{
		circleRadius = 5;
	}

	public Circle(int radius, int temp)// parameterized
	{
		circleRadius = 2;
		count = temp;
	}

	public void setRadius(int radius)// setting radius
	{
		circleRadius = radius;
	}

	public static double calculateArea()// called from another class
	{
		double area = 0.0;
		area = 2*1.732*circleRadius;
		return area;
	}
}