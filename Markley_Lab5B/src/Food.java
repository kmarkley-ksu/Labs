public class Food 
{
	String name;
	int caloriesPerServing, servingsPerContainer;
	
	public Food(String name, int calories, int servings)
	{
		this.name = name;
		this.caloriesPerServing = calories;
		this.servingsPerContainer = servings;
	}
	
	@Override
	public String toString()
	{
		String output = "Name is " + this.name + "\n";
		output += "Calories Per Serving: " + this.caloriesPerServing + "\n";
		output += "Servings Per Container: " + this.servingsPerContainer;
		return output;
	}
}
