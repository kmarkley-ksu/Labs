using System;

namespace Markley_Lab13C
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            //PART 1:
            int[,] arrayPart1 = new int[3, 4];

            for (int row = 0; row < arrayPart1.GetLength(0); row++)
            {
                for (int column = 0; column < arrayPart1.GetLength(1); column++)
                {
                    arrayPart1[row, column] = Convert.ToInt32(Console.ReadLine());
                }
            }

            for (int row = 0; row < arrayPart1.GetLength(0); row++)
            {
                for (int column = 0; column < arrayPart1.GetLength(1); column++)
                {
                    Console.Write("Value at [" + row + ", " + column + "] : " + 
                        arrayPart1[row, column] + "\t");
                }
                Console.WriteLine();
            }

            //Getting the sum array and printing it.
            int[] sums = SumColumns(arrayPart1);

            for(int index = 0; index < sums.Length; index++)
            {
                Console.Write(sums[index] + " | ");
            }
        }

        //PART 1:
        public static int[] SumColumns(int[,] someArray)
        {
            int[] columnSums = new int[someArray.GetLength(1)];

            for (int column = 0; column < someArray.GetLength(1); column++)
            {
                for (int row = 0; row < someArray.GetLength(0); row++)
                {
                    columnSums[column] += someArray[row, column];
                }
            }
            return columnSums;
        }
    }
}
