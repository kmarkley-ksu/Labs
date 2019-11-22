using System;

namespace Markley_Lab14
{
    class Program
    {
        static void Main(string[] args)
        {
            //Part 1:
            int[] myArray = new int[5];

            //Setting the array values.
            for(int i = 0; i < myArray.Length; i++)
            {
                Console.Write("Enter a number: ");
                myArray[i] = Convert.ToInt32(Console.ReadLine());
            }

            //Getting and printing the array values.
            for (int i = 0; i < myArray.Length; i++)
            {
                Console.Write(myArray[i] + " | ");
            }
            Console.WriteLine("\n");

            int compCount = LinearSearch(myArray, 5);
            Console.WriteLine("Number of comparsions for linear search for 5 before sorting: " + compCount);

            int bubbleSwaps = BubbleSort(myArray);
            Console.WriteLine("Number of swaps for bubble sort: " + bubbleSwaps);

            //Getting and printing the array values.
            for (int i = 0; i < myArray.Length; i++)
            {
                Console.Write(myArray[i] + " | ");
            }
            Console.WriteLine("\n");

            int binCompCount5 = BinarySearch(myArray, 5);
            Console.WriteLine("Found 5 after " + binCompCount5 + " comparsions");

            int binCompCount1 = BinarySearch(myArray, 1);
            Console.WriteLine("Found 1 after " + binCompCount5 + " comparsions");

            compCount = LinearSearch(myArray, 5);
            Console.WriteLine("Number of comparsions for linear search for 5 after sorting: " + compCount);
        }

        public static int LinearSearch(int[] someArray, int target)
        {
            int comparsions = 0;
            for(int i = 0; i < someArray.Length; i++)
            {
                comparsions++;
                if(someArray[i] == target)
                {
                    //We found it at position i.
                    return comparsions; //OR break
                }
            }
            return comparsions;
        }

        public static int BubbleSort(int[] someArray)
        {
            int comparsions = 0;
            int swaps = 0;
            for (int j = 0; j < someArray.Length; j++)
            {
                for (int i = 0; i < someArray.Length - 1; i++)
                {
                    comparsions++;
                    if (someArray[i] > someArray[i + 1])
                    {
                        swaps++;
                        int temp = someArray[i];
                        someArray[i] = someArray[i + 1];
                        someArray[i + 1] = temp;
                    }
                }
            }
            return swaps;
        }

        public static int BinarySearch(int[] someArray, int target)
        {
            int comparsions = 0;

            int highIndex = someArray.Length;
            int lowIndex = 0;
            int midIndex = (highIndex + lowIndex) / 2; //length / 2

            bool found = false;

            while(!found)
            {
                comparsions++;
                if(someArray[midIndex] == target)
                {
                    found = true;
                    Console.WriteLine("Found at " + midIndex + " spot");
                }
                else if(someArray[midIndex] > target)
                {
                    highIndex = midIndex;
                }
                else if(someArray[midIndex] < target)
                {
                    lowIndex = midIndex;
                }
                midIndex = (highIndex + lowIndex) / 2;
            }
            return comparsions;
        }
    }
}
