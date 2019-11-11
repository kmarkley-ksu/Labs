import java.util.*;

public class Lab5B 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
//		System.out.println();
//		int x = scan.nextInt();
		
//		Stack<Integer> stack1 = new Stack<Integer>();
//		stack1.Push(0);
//		stack1.Push(15);
//		stack1.Push(40);
//		stack1.Push(50);
//		
//		System.out.println(stack1.Display());
//		
//		stack1.Pop();
//		
//		System.out.println(stack1.Display());
		
		//Clothes stack:
//		Stack<Clothes> stack1Clothes = new Stack<Clothes>();
//		stack1Clothes.Push(new Clothes("Blouse", "Red", false));
//		
//		Clothes tempClothes = new Clothes("Shirt", "Blue", true);
//		stack1Clothes.Push(tempClothes);
//		stack1Clothes.Push(tempClothes);
//		stack1Clothes.Push(tempClothes);
		Stack stack1Clothes = new Stack();
		stack1Clothes.Push(new Clothes("Blouse", "Red", false));
		
		Clothes tempClothes = new Clothes("Shirt", "Blue", true);
		stack1Clothes.Push(tempClothes);
		stack1Clothes.Push(tempClothes);
		stack1Clothes.Push(tempClothes);
		
		System.out.println(stack1Clothes.Display());
		
		stack1Clothes.Pop();
		
		System.out.println("Printing again after pop: \n");
		
		System.out.println(stack1Clothes.Display());
	}
}
