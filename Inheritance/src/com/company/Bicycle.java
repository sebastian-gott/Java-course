package com.company;

public class Bicycle {

    private int gear;
    private int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    //Decreases speed by affecting speed with decrement
    //Polymorphism two of the same method with different actions
    public void applyBrake (int decrement) {
        speed -= decrement;
    }

    //Affects speed with increment
    public void speedUp(int increment) {
        speed += increment;
    }
    public void speedUp(){
        speed ++;
    }

    public void gearDown(int decrement) {
        gear -= decrement;
    }
    public void gearUp(){
        gear ++;
    }

    //Prints a string with the information
    public String printInfo(){
        return("the number of the gears are " + gear +
                "\n" + "speed of bicycle is " + speed);
    }
}
