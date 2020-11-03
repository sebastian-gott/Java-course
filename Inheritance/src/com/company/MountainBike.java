package com.company;

class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        //Gets Bicycle sub class properties
        super(gear, speed);
        seatHeight = startHeight;
    }

    //Mountainbike class adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String printInfo() {
        return (super.printInfo() + "\nseat height is " + seatHeight);
    }
}
