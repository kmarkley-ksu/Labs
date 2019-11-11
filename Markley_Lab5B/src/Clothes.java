public class Clothes 
{
	String name, color;
	boolean highTemperature;
	
	public Clothes(String name, String color, boolean temp)
	{
		this.name = name;
		this.color = color;
		this.highTemperature = temp;
	}
	
	@Override
	public String toString()
	{
		String output = "Name is " + this.name + "\n";
		output += "Color is " + this.color + "\n";
		output += "Can be washed at high temp: " + this.highTemperature;
		return output;
	}
}
