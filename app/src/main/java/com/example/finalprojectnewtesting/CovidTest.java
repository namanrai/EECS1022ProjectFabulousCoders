package com.example.finalprojectnewtesting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CovidTest {

    public static void main(String[] args) {
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

                System.out.println("Affected: " + covid.getAffected());
                System.out.println("Death: " + covid.getDeath());
                System.out.println("Recovered: " + covid.getRecovered());
                System.out.println("Active: " + covid.getActive());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
