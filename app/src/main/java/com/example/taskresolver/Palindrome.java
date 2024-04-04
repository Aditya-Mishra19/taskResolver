package com.example.taskresolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Palindrome extends AppCompatActivity {
    EditText string;
    TextView show;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);
        string = findViewById(R.id.getString);
        show = findViewById(R.id.result);
    }
    public void checkPalin(View v) {
        String str = string.getText().toString();
        int start = 0, end = str.length()-1;
        boolean ans = true;
        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) {
                ans = false;
                break;
            }
            start += 1;
            end -= 1;
        }
        if(ans) {
            show.setText("Given String is a Palindrome!");
        }
        else {
            show.setText("Given String is not a Palindrome!");
        }
    }

}