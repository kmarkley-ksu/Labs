import java.util.Scanner;

public class Lab13
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[][] part12DArray = new int[5][2];
								//{{1, 2}, {3, 4}};
		
		for(int i = 0; i < part12DArray.length; i++)
		{
			for(int j = 0; j < part12DArray[i].length; j++)
			{
				System.out.print(part12DArray[i][j] + " |");
			}
			System.out.println();
		}
		
		for(int i = 0; i < part12DArray.length; i++)
		{
			for(int j = 0; j < part12DArray[i].length; j++)
			{
				part12DArray[i][j] = scan.nextInt();
			}
		}
		
		int[] sumColumn = new int[2];
		for(int j = 0; j < part12DArray[0].length; j++)
		{
			for(int i = 0; i < part12DArray.length; i++)
			{
				sumColumn[j] += part12DArray[i][j];
			}
		}
		
		System.out.println("\n");
		for(int i = 0; i < sumColumn.length; i++)
		{
			System.out.print(sumColumn[i] + ", ");
		}
	}
}
