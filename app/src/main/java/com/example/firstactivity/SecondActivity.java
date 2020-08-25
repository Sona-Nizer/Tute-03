package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText edNum1;
    EditText edNum2;

    String number1;
    String number2;
    TextView lblSum;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edNum1 =findViewById(R.id.edNum1);
        edNum2 =findViewById(R.id.edNum2);
        lblSum =findViewById(R.id.lblSum);

        Intent intent=getIntent();//get first intent without creating new one

         number1=intent.getStringExtra("n1"); //retrive num1 from first activity
         number2=intent.getStringExtra("n2"); //retrive num2 from first activity

        edNum1.setText(number1);
        edNum2.setText(number2);

        n1=Integer.parseInt(number1);//get as string and convert to int
        n2=Integer.parseInt(number2);

    }

    public void add(View view){
              lblSum.setText(number1 + " + " + number2 + " = " + (n1+n2));
    }

    public void subtract(View view){

        lblSum.setText(number1 + " - " + number2 + " = " + (n1-n2));
    }
    public void multiply(View view){

        lblSum.setText(number1 + " x " + number2 + " = " + (n1*n2));
    }
    public void divide(View view)
    {
        lblSum.setText(number1 + " / " + number2 + " = " + (n1/n2));
    }


}