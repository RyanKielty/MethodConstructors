package com.company;

/**
 * Created by ryankielty on 11/14/16.
 */
public class Car {
    private int mileage;
    private int year;
    private String make;
    private String model;
    private String color;
    private boolean usesGasoline;
    private boolean isUsed;

    public int getMileage() {
        return mileage;
    }
    public void setMileage(int m) {
        if(m > 0) {
            mileage = m;
        }
    }

    public int getYear() {
        return year;
    }
    public void setYear(int y) {
        if(y >= 2004) {
            year = y;
        }
    }

    public String getMake() {
        return make;
    }
    public void setMake(String k) {
        make = k;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String l) {
        model = l;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        color = c;
    }

    public boolean usesGasoline(){
        return usesGasoline;
    }
    public void setGasoline (boolean g) {
        usesGasoline = g;
    }

    public boolean isUsed(){
        return isUsed;
    }
    public void setUsed (boolean u) {
        isUsed = u;
    }
}
