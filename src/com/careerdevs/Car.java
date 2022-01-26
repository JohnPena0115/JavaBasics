package com.careerdevs;

import java.text.NumberFormat;

public class Car {

    public String make;
    public String model;
    public int mileage;
    public float gasTankPercent;

    public Car(String make, String model, int mileage, float gasTankPercent){

        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }

    NumberFormat miles = NumberFormat.getInstance();
    NumberFormat percent = NumberFormat.getPercentInstance();


    @Override
    public String toString(){

        return "The " + make + " " + model + " was returned with an odometer reading of "
                + miles.format(mileage) + " and " + percent.format(gasTankPercent) +
                " of fuel left in the tank.";
    }


}
