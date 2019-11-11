public class Rectangle 
{
	double height, width;
	
	public Rectangle()
	{
		this.height = 1.0;
		this.width = 1.0;
	}
	public Rectangle(double height2, double width)
	{
		this.height = height2;
		this.width = width;
	}
	
	//Getters
	public double GetArea()
	{
		return this.height * this.width;
	}
	public double GetPerimeter()
	{
		return (this.height + this.width) * 2;
	}
	public double GetHeight()
	{
		return this.height;
	}
	public double GetWidth()
	{
		return this.width;
	}
}
