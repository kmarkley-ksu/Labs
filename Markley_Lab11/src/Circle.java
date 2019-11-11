public class Circle
{
	double radius;
	
	//Constructors
	public Circle() //Default
	{
		this.radius = 1.0;
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	//Getter
	public double GetRadius()
	{
		return this.radius;
	}
	//Setter
	public void SetRadius(double radius)
	{
		this.radius = radius;
	}
	
	//Class methods
	public double GetArea()
	{
		return Math.pow(this.radius, 2) * Math.PI;
	}
	public double GetPerimeter()
	{
		return 2 * Math.PI * this.radius;
	}
	
	@Override
	public String toString()
	{
		return "Circle " + this.hashCode() + " has radius " + this.radius;
	}
}
