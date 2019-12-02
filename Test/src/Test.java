public class Test 
{
	public static void main(String[] args)
	{
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("Luna", "yelp!");
		
		System.out.println("Dog #1 name is " + dog1.Name() + ".");
		
		dog1.Name("Buddy");
		System.out.println("Dog #1’s name was changed to " + 
				dog1.Name() + ".");
		
		System.out.print("Dog #1 barked: ");
		dog1.BarkSound();
		
		System.out.println("Dog #2 name is " + dog2.Name() + ".");
		
		dog2.Name("Louise");
		System.out.println("Dog #2’s name was changed to " + 
				dog2.Name() + ".");
		
		System.out.print("Dog #2 barked: ");
		dog2.BarkSound();
	}
}
