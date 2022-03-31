package com.example.finalprojectnewtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class Covidview extends AppCompatActivity {
    public String affect, death, recover, active;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covidview);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        initCovid();

    }

    public void initCovid() {
        Background bg = new Background(getApplicationContext());
        bg.doInBackground();
        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        //retrieving your strings from preferences
        SharedPreferences prefs2 = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        String s1 = prefs.getString("affected", ""); //empty string is the default value
        String s2 = prefs.getString("s2", ""); //empty string is the default value
        System.out.println(s1);



        TextView affectText = (TextView) findViewById(R.id.affectedCases);
        TextView deathsText = (TextView) findViewById(R.id.deathCases);
        TextView recoverText = (TextView) findViewById(R.id.recoveredCases);
        TextView activeText = (TextView) findViewById(R.id.activeCases);


        affectText.setText(prefs.getString("affected", ""));
        deathsText.setText(prefs.getString("deaths", ""));
        recoverText.setText(prefs.getString("recovered", ""));
        activeText.setText(prefs.getString("active", ""));


    }

    public void buttonPressed (View v) {
        //Saving your strings
        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("s1", "yes");
        editor.putString("s2", "no");
        editor.commit();
        //retrieving your strings from preferences
        SharedPreferences prefs2 = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        String s1 = prefs.getString("affected", ""); //empty string is the default value
        String s2 = prefs.getString("s2", ""); //empty string is the default value
        System.out.println(s1);




    }


    /*public static String readFromFile(String username, String password) {
        Scanner input;
        boolean flag = false;
        ArrayList<User> users = new ArrayList<>();
        String path = new File("").getAbsolutePath();
        try {
            System.out.println(path);
            path = new File("").getAbsolutePath();
            System.out.println(path);
            input = new Scanner(new File(path + "/covid.txt"));
            input.useDelimiter(",");

            int index = 0;

            while (input.hasNext()) {
                users.add(index, new User(input.next().replaceAll("\n", "").replaceAll("\r", ""),
                        input.next(), input.next()));
            }
            System.out.println(users.toString());
        }
        catch (FileNotFoundException e) {
            System.out.println("File not Found :( (all other fields)");
        }
        return users.toString();
    }*/

/*    public static void covid(View v) {
        CovidStats covid = new CovidStats();
        try {
            URL url = new URL("https://api.opencovid.ca/");

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = in.readLine()) != null) {
                String[] wholeValues = line.split(",");


                covid.setAffected(wholeValues[5].split(":")[1]);
                covid.setDeath(wholeValues[7].split(":")[1].split("\\.")[0]);
                covid.setRecovered(wholeValues[9].split(":")[1].split("\\.")[0]);
                covid.setActive(wholeValues[0].split(":")[2]);

                //Saving your strings
                SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("affected", covid.getAffected());
                editor.putString("deaths", covid.getDeath());
                editor.putString("recovered", covid.getRecovered());
                editor.putString("active", covid.getActive());
                editor.commit();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

    }