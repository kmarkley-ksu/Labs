import java.util.Scanner;
import java.util.Random;

public class Lab14
{
	public static void main(String[] args)
	{
		//PART 1:
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int[] arrayPart1 = new int[100];
		
		System.out.println("Enter values: ");
		for(int i = 0; i < arrayPart1.length; i++)
		{
			//arrayPart1[i] = scan.nextInt();
			arrayPart1[i] = random.nextInt(100);
		}
		
		System.out.println("Enter a number to look for: ");
		int target = scan.nextInt();
		int count = LinearSearch(arrayPart1, target);
		
		System.out.println("Printing array: ");
		for(int i = 0; i < arrayPart1.length; i++)
		{
			System.out.print(arrayPart1[i] + " | ");
		}
		
		System.out.println("Count of " + target + 
				" is " + count + "\n");
		
		System.out.println("Sorted array: ");
		BubbleSort(arrayPart1);
		for(int i = 0; i < arrayPart1.length; i++)
		{
			System.out.print(arrayPart1[i] + " | ");
		}
		
		
		
	}
	
	//PART 1:
	public static int LinearSearch(int[] someArray, int target)
	{
		int count = 0;
		int comparsions = 0;
		for(int i = 0; i < someArray.length; i++)
		{
			comparsions += 1;
			if(someArray[i] == target)
			{
				count++;
			}
		}
		return count;
	}
	public static void BubbleSort(int[] someArray)
	{
		for(int j = 0; j < someArray.length; j++)
		{
			for(int i = 0; i < someArray.length - 1; i++)
			{
				if(someArray[i] > someArray[i + 1])
				{
					int temp = someArray[i];
					someArray[i] = someArray[i + 1];
					someArray[i + 1] = temp;
				}
			}
		}
	}
	public static int BinarySearch(int[] someArray, int target)
	{
		int count = 0;
		
		int endIndexPoint = someArray.length;
		int startIndexPoint = 0;
		int midIndexPoint = (endIndexPoint + 
							startIndexPoint) / 2;
		while(startIndexPoint < endIndexPoint)
		{
			if(someArray[midIndexPoint] == target)
			{
				count++;
				startIndexPoint++;
			}
			else if(someArray[midIndexPoint] < target)
			{
				startIndexPoint = midIndexPoint;
			}
			else if(someArray[midIndexPoint] > target)
			{
				endIndexPoint = midIndexPoint;
			}
			midIndexPoint = (endIndexPoint + 
					startIndexPoint) / 2;
		}
		return count;
	}
}
