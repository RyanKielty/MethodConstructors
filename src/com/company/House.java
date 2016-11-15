package com.company;

/**
 * Created by ryankielty on 11/14/16.
 */
public class House {
    private int streetnumber;
    private int garagestall;
    private String streetname;
    private String streettype;
    private String color;
    private boolean isGarage;

    public int getStreetnumber() {
        return streetnumber;
    }
    public void setStreetnumber(int n) {
        if(n > 1701 && n < 1856) {
            streetnumber = n;
        }
    }

    public int getGaragestall(){
        return garagestall;
    }
    public void setGaragestall(int g) {
        if(g > 0) {
            garagestall = g;
        }
    }

    public String getStreetname() {
        return streetname;
    }
    public void setStreetname(String s) {
        streetname = s;
    }

    public String getStreettype() {
        return streettype;
    }
    public void setStreettype(String t) {
        streettype = t;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public boolean hasGarage() {
        return isGarage;
    }
    public void setGarage(boolean a) {
        isGarage = a;
    }
}
