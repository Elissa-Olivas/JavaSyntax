package com.company;

public class Trucks extends Vehicle implements Mover {
    String feature; // like 4wheel drive
    int speed;
    //inherits the Make and Model from the Vehicle Class

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    //Constructor from the Vehicle Class brings in the SUPER
    public Trucks(String make, String model, String feature, int speed) {
        super(make, model);
        this.feature = feature;
        this.speed = speed;
    }

    //Bring in the method from Vehicle Class
    @Override
    public void describeCar() {
        super.describeCar(); // super.nameOfMethod();
        System.out.println("Features: " + feature);
    }

    @Override
    public void mover() { //this Class implements the Mover Interface, so it must implement all the methods listed in the interface.
        System.out.println("the vehicle can go " + speed + " MPH."); //"It is a" + getMake() + " " + getModel() - if you wanted to call the info from the super class
        //use getMake() to get the variables from the superClass
    }
}
