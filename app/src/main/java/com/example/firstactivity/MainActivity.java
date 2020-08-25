package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edNum1;
    EditText edNum2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //to only define text objects
        setContentView(R.layout.activity_main);
        edNum1 = findViewById(R.id.edNum1);
        edNum2 = findViewById(R.id.edNum2);


    }

    public void openSecond(View view){
        Intent intent =new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("n1",edNum1.getText().toString());
        intent.putExtra("n2",edNum1.getText().toString());


       // Toast.makeText(this, "opening calculator...", Toast.LENGTH_SHORT).show();


        //Steps in Creating custom toast
        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
      //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
        findViewById(R.id.custom_toast_layout));
       //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
        startActivity(intent); //pass values

    }


}