public class Dog
{
	private String name, bark;
	
	public Dog()
	{
		this.name = "Spot";
		this.bark = "woof!";
	}
	public Dog(String name, String bark)
	{
		this.name = name;
		this.bark = bark;
	}
	
	public String Name()
	{
		return this.name;
	}
	public void Name(String name)
	{
		this.name = name;
	}
	
	public void BarkSound()
	{
		System.out.println(this.bark);
	}
}
