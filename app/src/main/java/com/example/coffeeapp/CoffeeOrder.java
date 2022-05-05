package com.example.coffeeapp;

import java.util.Random;

public class CoffeeOrder {
    private double price;
    private int quantity;

    public CoffeeOrder(double price) {
        if(price < 0)
        {
            this.price = 0;
        }
        else
        {
            this.price = price;
        }
        this.quantity = 0;
    }

    public void AddCoffee()
    {
        this.quantity += 1;

    }
    public void RemoveCoffee()
    {
        if(this.quantity > 0)
        {
            this.quantity -= 1;
        }
    }

    public int GetQuantity()
    {
        return quantity;
    }

    public double CalculateOrderPrice ()
    {
        double result = 0;
        result = this.price * this.quantity;

        return result;
    }

    //private int Table()
    //{
    //    Random random = new Random();
   //     int numtable = random.nextInt(500-1) + 1 + 500;
    //    return numtable;
   //     String ntable = String.valueOf(numtable);
   // }



}

