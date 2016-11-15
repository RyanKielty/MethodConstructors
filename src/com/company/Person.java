package com.company;

/**
 * Created by ryankielty on 11/15/16.
 */
public class Person {
    private int height;
    private int age;
    private String name;
    private String hair;
    private boolean isBald;

    public int getHeight(){
        return height;
    }
    public void setHeight(int h) {
        height = h;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public String getHair() {
        return hair;
    }
    public void setHair(String r) {
        hair = r;
    }

    public boolean isBald(){
        return isBald;
    }

    public void setBald(boolean b) {
        isBald = b;
    }
}
