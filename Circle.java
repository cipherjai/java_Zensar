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
		circleRadius = radius;
		count = temp;
	}

	public void setRadius(int radius)// setting radius
	{
		circleRadius = radius;
	}

	public int getRadius()
	{
		return circleRadius;
	}

	public double calculateArea()// called from another class
	{
		return 1.732*circleRadius*circleRadius ;
	}

	public String toString()
	{
		return (1.732*circleRadius*circleRadius)+"";
	}
}
