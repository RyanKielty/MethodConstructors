package com.company;

/**
 * Created by ryankielty on 11/14/16.
 */
public class Railcar {
    private int cars;
    private String companyname;
    boolean hasPassengers;
    boolean isElectric;

    public int getCars() {
        return cars;
    }
    public void setCars(int c) {
        cars = c;
    }

    public String getCompanyname() {
        return companyname;
    }
    public void setCompanyname(String n) {
        companyname = n;
    }

    public boolean hasPassengers() {
        return hasPassengers;
    }
    public void setPassengers(boolean p) {
        hasPassengers = p;
    }

    public boolean isElectric() {
        return isElectric;
    }
    public void setElectric(boolean e) {
        isElectric = e;
    }
}
