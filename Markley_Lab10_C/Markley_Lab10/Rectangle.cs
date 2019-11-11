using System;
using System.Collections.Generic;
using System.Text;

namespace Markley_Lab10
{
    class Rectangle
    {
        double height, width;

        public Rectangle()
        {
            this.height = 1.0;
            this.width = 1.0;
        }
        public Rectangle(double h, double w)
        {
            this.height = h;
            this.width = w;
        }

        public double GetHeight()
        {
            return this.height;
        }

        public double GetArea()
        {
            return this.height * this.width;
        }

        public override string ToString()
        {
            String output = "Height: " + this.height + "\n";
            output += "Width: " + this.width + "\n";
            return output;
        }
    }
}
