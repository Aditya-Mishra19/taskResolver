package com.example.taskresolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fibonacci extends AppCompatActivity {
    TextView show;
    EditText num;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
        num = findViewById(R.id.getNumber);
        show = findViewById((R.id.result));
    }
    public void findFibo(View v) {
        Integer number = Integer.parseInt(num.getText().toString());
        int ans = getfibonacci(number);
        show.setText("Fibonacci of " + number + " is : " + ans);
    }
    private int getfibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return getfibonacci(n-1) + getfibonacci(n - 2);
    }
}