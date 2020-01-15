package com.demo.megam1n4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    class Number
    {
        int number;

        public boolean isSquare()
        {
            double squareRoot = Math.sqrt(number);

            if(squareRoot == Math.floor(squareRoot))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public boolean isTriangular()
        {
            int x = 1;
            int triNumber = 1;

            while (triNumber < number)
            {
                x++;

                triNumber += x;
            }

            if(triNumber == number)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public void testNumber(View view)
    {
        Log.i("info", "pressed!");

        EditText editText = (EditText) findViewById(R.id.editText);

        String message;

        if(editText.getText().toString().isEmpty())
        {
            message = "Please Enter a Number You Moron!";
        }
        else {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(editText.getText().toString());

            if (myNumber.isSquare() && myNumber.isTriangular()) {
                message = editText.getText().toString() + " is a Square and a Triangular Number! ^_^";
            } else if (myNumber.isSquare()) {
                message = editText.getText().toString() + " is a Square Number (Not Triangular)! :]";
            } else if (myNumber.isTriangular()) {
                message = editText.getText().toString() + " is a Triangular Number (Not Square)! :|";
            } else {
                message = editText.getText().toString() + " is neither a Square nor a Triangular Number! ><!";
            }

        }

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
