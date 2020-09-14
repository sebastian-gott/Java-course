package com.company;
//Floating point numbers have fractional parts that we express with a decimal. Used when calculating more precise numbers

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5 / 3;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue " +  myIntValue);
        System.out.println("MyFloatValue " +  myFloatValue);
        System.out.println("MyDoubleValue " +  myDoubleValue);

        double poundToKg = 0.45;
        double pound = 210;
        System.out.println(pound + "lbs is equal to " + (pound * poundToKg) + "kg");


    }
}
