package com.example.taskresolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkPalin(View v) {
        Intent intent = new Intent(getApplicationContext(), Palindrome.class);
        startActivity(intent);
    }
    public void checkGreatest(View v) {
        Intent intent = new Intent(getApplicationContext(), Greatest.class);
        startActivity(intent);
    }

    // I have added One more operation for your reference.
    // I will encourge you to add more operation, it will fit into your brain...
    public void getFibonacci(View v) {
        Intent intent = new Intent(getApplicationContext(), Fibonacci.class);
        startActivity(intent);
    }
}