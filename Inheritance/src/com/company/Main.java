package com.company;


public class Main {

    public static void main(String[] args) {

        MountainBike mb = new MountainBike(3,100,25);
        System.out.println(mb.printInfo());
        mb.setHeight(50);
        mb.gearDown(2);
        mb.speedUp(20);
        System.out.println("\nNew status: ");
        System.out.println(mb.printInfo());
    }
}
