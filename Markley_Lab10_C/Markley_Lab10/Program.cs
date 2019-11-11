using System;

namespace Markley_Lab10
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            Rectangle rec1 = new Rectangle();

            double x = Convert.ToDouble(Console.ReadLine());
            Rectangle rec2 = new Rectangle(x, 6.0);

            Console.WriteLine(rec1.GetArea());
            Console.WriteLine(rec1);
            Console.WriteLine(rec2);

            Stock google = new Stock("Google", "GOG");

            google.SetCurrentPrice(151.5);

            Console.WriteLine(google);
        }
    }
}
