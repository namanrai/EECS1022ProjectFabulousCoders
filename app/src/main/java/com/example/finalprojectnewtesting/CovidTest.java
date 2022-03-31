    package com.example.finalprojectnewtesting;

    import android.content.Context;
    import android.content.SharedPreferences;
    import android.view.View;
    import android.widget.TextView;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.net.URL;
    import java.util.ArrayList;
    import java.util.Arrays;

    public class CovidTest {
/*        public void covid(View v) {
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
