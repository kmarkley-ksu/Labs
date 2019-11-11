import java.util.Scanner;
import java.util.Random;

public class Lab12
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		char[] charArray = new char[255];
		
		//PART 1:
		System.out.print("Class size: ");
		int classSize = scan.nextInt();
		
		int[] part1Array = new int[classSize];
		
		//Traverse the part1Array array going from index 0 -> last index.
		for(int index = 0; index < part1Array.length; index++)
		{
			part1Array[index] = scan.nextInt();  //Assign index user input.
		}
		
		PrintGrades(part1Array); //need some argument.
		//PART 2:
		
		//PART 3:
	}
	
	//Part 1:
	public static void PrintGrades(int[] grades)
	{
		for(int index = 0; index < grades.length; index++)
		{
			if(grades[index] >= 90)
			{
				System.out.print("Student " + index + " score is " +
							grades[index] + "and grade is A");
			}
		}
	}
	
	//Part 2:
	public static boolean CompareArrays(int[] array1, int[] array2)
	{
		return true;
	}
	
	//Part 3:
	public static int ArrayMax(int[] array)
	{
		return 0;
	}
	public static int ArrayMin(int[] array)
	{
		return 0;
	}
	public static void ArraySquared(int[] array)
	{
		
	}
	public static void ArrayReversed(int[] array)
	{
		
	}
}
