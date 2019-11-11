import java.util.Scanner;
import java.util.Random;

public class Lab5A 
{
	public static void main(String[] args)
	{
		MarkleyArrayList list = new MarkleyArrayList();
		
		System.out.println("Printing list: ");
		for(int i = 0; i < list.count; i++)
		{
			System.out.print(list.Get(i) + " ");
		}
		System.out.println("\nDone printing list!");
		
		list.AddAtEnd(15);  //Adding an item to my list.
		list.AddAtEnd(25);
		//list.RemoveAtEnd();
		
		System.out.println("Printing list: ");
		for(int i = 0; i < list.size; i++)
		{
			System.out.print(list.Get(i) + " ");
		}
		System.out.println("\nDone printing list!");
		
		//PART 2:
		MarkleyLinkedList linkedList = new MarkleyLinkedList();
		
		System.out.println("Printing list: ");
		for(int i = 0; i < linkedList.count; i++)
		{
			System.out.print(linkedList.Get(i) + " ");
		}
		System.out.println("\nDone printing list!");
		
		linkedList.AddAtEnd(15);  //Adding an item to my list.
		linkedList.AddAtEnd(25);
		linkedList.RemoveAtEnd();
		
		System.out.println("Printing list: ");
		for(int i = 0; i < linkedList.count; i++)
		{
			System.out.print(linkedList.Get(i) + " ");
		}
		System.out.println("\nDone printing list!");
		
		//System.out.println("Mod: " + (-1 % 10));
	}
}
