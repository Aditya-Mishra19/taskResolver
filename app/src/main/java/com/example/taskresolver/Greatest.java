package com.example.taskresolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Greatest extends AppCompatActivity {
    EditText num1, num2;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greatest);
        num1 = findViewById(R.id.getNum1);
        num2 = findViewById(R.id.getNum2);
        show = findViewById(R.id.result);
    }

    public void checkgreatest(View v) {
        Integer a = Integer.parseInt(num1.getText().toString());
        Integer b = Integer.parseInt(num2.getText().toString());
        if(a > b) {
            show.setText(a + " is greater than " + b);
        }
        else if(b > a) {
            show.setText(b + " is greater than " + a);
        }
        else {
            show.setText(a + " is equal to  " + b);
        }
    }
}