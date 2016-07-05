public class Rectangle
{
	private int rectangleLength;
	private int rectangleBreadth;

	Rectangle()
	{
		rectangleLength = 5;
		rectangleBreadth = 6;
	}
	/*param
	toString
	get 
	set
	*/
	Rectangle(int len,int breadth)
	{
		rectangleBreadth = breadth;
		rectangleLength = len;
	}

	public void setLength(int length)
	{
		rectangleLength = length;
	}

	public int getLength()
	{
		return rectangleLength ;
	}

	public void setBreadth(int breadth)
	{
		rectangleBreadth = breadth ;
	}

	public int getBreadth()
	{
		return rectangleBreadth ;
	}

	public String toString()
	{
		return (rectangleBreadth*rectangleLength)+"";
	}
}