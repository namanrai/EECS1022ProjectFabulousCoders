package com.example.finalprojectnewtesting;

import android.content.SharedPreferences;
import android.content.Context;
import android.os.AsyncTask;
import android.preference.PreferenceManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Background extends AsyncTask<Integer,Void,String>{

    private Context context;

    public Background(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(Integer... params) {
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
                SharedPreferences prefs = context.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("affected", covid.getAffected());
                System.out.println(covid.getAffected());
                editor.putString("deaths", covid.getDeath());
                editor.putString("recovered", covid.getRecovered());
                editor.putString("active", covid.getActive());
                editor.commit();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this.context);
    }
}