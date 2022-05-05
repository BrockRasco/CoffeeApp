package com.example.coffeeapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class CoffeeOrder {
    private int idOrder;
    private String tablenumber;
    private Date dateOfOrder;
    private ArrayList<Drink> Drinks;

    public CoffeeOrder(int idOrder, String tablenumber, Date dateOfOrder)
    {
        this.idOrder = idOrder;
        this.tablenumber = tablenumber;
        this.dateOfOrder = null;
    }


}

