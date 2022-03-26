package com.example.finalprojectnewtesting;

public class CovidStats {
    private String Affected;
    private String Death;
    private String Recovered;
    private String Active;

    public CovidStats(){}

    public String getAffected() {
        return Affected;
    }

    public void setAffected(String affected) {
        Affected = affected;
    }

    public String getDeath() {
        return Death;
    }

    public void setDeath(String death) {
        Death = death;
    }

    public String getRecovered() {
        return Recovered;
    }

    public void setRecovered(String recovered) {
        Recovered = recovered;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }
}
