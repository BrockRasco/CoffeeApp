package com.example.coffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Button plusCoffee;
    Button minusCoffee;
    CoffeeOrder myCoffeeOrder;
    TextView textViewQuantity;
    Button totalCoffee;
    TextView textViewTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        iniatializeUI();
        myCoffeeOrder = new CoffeeOrder( 2.20);

        minusCoffee.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Retirer un café dans l'objet  CoffeeOrder
                myCoffeeOrder.RemoveCoffee();
                textViewQuantity.setText(""+myCoffeeOrder.GetQuantity());

            }
        });


        plusCoffee.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // Ajout d'un café dans l'objet CoffeeOrder
                myCoffeeOrder.AddCoffee();
                textViewQuantity.setText(""+myCoffeeOrder.GetQuantity());

            }
        });

        totalCoffee.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Totale des café
                textViewTotal.setText(""+myCoffeeOrder.CalculateOrderPrice());

            }
        });




    }

    private void iniatializeUI()
    {
        plusCoffee = findViewById(R.id.plusCoffee);
        minusCoffee = findViewById(R.id.minusCoffee);
        totalCoffee = findViewById(R.id.totalCoffee);
        textViewQuantity= findViewById(R.id.textViewQuantity);
        textViewTotal = findViewById(R.id.textViewTotal);
    }
}