public class Lab10 
{
	public static void main(String[] args)
	{
		System.out.println();
		
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(50, 25);
		
		System.out.println(rec1.GetHeight());
		System.out.println(rec2.GetHeight());
		
		//PART 2:
		Stock goog = new Stock("Google", "GOG");
		
		System.out.println(goog.previousClosingPrice);
		System.out.println(goog.GetName());
	}
}
