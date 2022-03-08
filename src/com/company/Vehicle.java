package com.company;

public class Vehicle {
    private String make;
    private String model;

    //Constructor
    public Vehicle (String make, String model) {
        this.make = make;
        this.model = model;
    }
    //setter to Make Variable
    public void setMake(String make) {
        this.make = make;
    }
    //Getter to Make variable
    public String getMake() {
        return make;
    }


    //setter to Model variable

    public void setModel(String model) {
        this.model = model;
    }

    //getter to Model variable

    public String getModel() {
        return model;
    }


    //Method to describe a car, call it on main to use it

    public void describeCar() {
        System.out.println("The car is a " + make + " " + model);
    }
}
