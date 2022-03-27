package com.example.finalprojectnewtesting;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public int guessesUsed = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void buttonClicked(View v) {
            EditText triesBox  =  findViewById(R.id.triesbox);
            String tb = triesBox.getText().toString();


            //Scanner input =  new Scanner(System.in);
            EditText rangebox  =  findViewById(R.id.rangebox);
            int rb = Integer.parseInt(rangebox.getText().toString());


            int num = (int) ((Math.random()* rb));



            ((TextView) findViewById(R.id.answer)).setText(String.valueOf(num));


        }
        public void button2(View v) {
            guessesUsed += 1;
            EditText triesBox  =  (EditText) findViewById(R.id.triesbox);
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
        }

        public void loginButton(View v) {
            //EditText usernameEntry = findViewById(R.id.usernameEntry);
            //String userEntry = usernameEntry.getText().toString();

            //EditText passwordEntry = findViewById(R.id.passwordEntry);
            //String passEntry = passwordEntry.getText().toString();

            try {
                FileWriter myWriter = new FileWriter("SignIn.txt");
                myWriter.write("username" + "," + "password" + "\n");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }

        public void writeToFile(String username, String password) {

            try {
                FileWriter myWriter = new FileWriter("SignIn.txt");
                myWriter.write(username + "," + password + "\n");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        }
