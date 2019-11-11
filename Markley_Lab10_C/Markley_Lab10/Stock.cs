using System;
using System.Collections.Generic;
using System.Text;

namespace Markley_Lab10
{
    class Stock
    {
        String name, symbol;
        double previousClosingPrice, currentPrice;
        public Stock(String name, String symbol)
        {
            this.name = name;
            this.symbol = symbol;
        }

        public void SetCurrentPrice(double currentPrice)
        {
            this.currentPrice = currentPrice;
        }

        public override string ToString()
        {
            String output = this.name + " Stock: " + "\n";
            output += "\t" + "Symbol: " + this.symbol + "\n";
            output += "\t" + "CurrentPrice: " + this.currentPrice + "\n";

            return output;
        }
    }
}
