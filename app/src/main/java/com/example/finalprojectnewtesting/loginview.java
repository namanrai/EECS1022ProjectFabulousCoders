package com.example.finalprojectnewtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class loginview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginview);
    }

    public void testbutton(View v) {
        Intent i = new Intent(this, Covidview.class);
        startActivity(i);
    }
/*
    public void loginButton(View v) {
        EditText triesBox = (EditText) findViewById(R.id.triesbox);
        if (guessesUsed <= Integer.parseInt(triesBox.getText().toString())) {
            TextView secretNum = (TextView) findViewById(R.id.answer);
            String num = secretNum.getText().toString();

            EditText guessBox = (EditText) findViewById(R.id.guessbox);
            String gb = guessBox.getText().toString();

            if (num.equals(gb)) {
                ((TextView) findViewById(R.id.answer2)).setText("true");
            } else {
                ((TextView) findViewById(R.id.answer2)).setText("false");
            }
        } else {
            ((TextView) findViewById(R.id.answer2)).setText("out of guesses");
        }
    }*/

}