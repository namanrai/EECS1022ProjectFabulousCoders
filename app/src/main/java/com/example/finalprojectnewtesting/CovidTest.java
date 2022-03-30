package com.example.finalprojectnewtesting;

import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CovidTest {
    public String[] covid() {
        String[] covidStuff = new String[4];
        try {
            URL url = new URL("https://api.opencovid.ca/");

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = in.readLine()) != null) {
                String[] wholeValues = line.split(",");

                CovidStats covid = new CovidStats();

                covid.setAffected(wholeValues[5].split(":")[1]);
                covid.setDeath(wholeValues[7].split(":")[1].split("\\.")[0]);
                covid.setRecovered(wholeValues[9].split(":")[1].split("\\.")[0]);
                covid.setActive(wholeValues[0].split(":")[2]);

                covidStuff[0] = covid.getAffected();
                covidStuff[1] = covid.getDeath();
                covidStuff[2]  = covid.getRecovered();
                covidStuff[3]  = covid.getActive();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return covidStuff;
    }
}
