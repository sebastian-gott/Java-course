package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    //An int occupies 32 bits
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value= " + myMinIntValue);
        System.out.println("Integer maximum value= " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1));

        //A byte occupies 8 bits. A width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + myMinByteValue);
        System.out.println("Byte max value = " + myMaxByteValue);

        //A short occupies 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value = " + myMinShortValue);
        System.out.println("Short max value = " + myMaxShortValue);
    
        //Use Capital L at the end of the number for a long
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLongValue);
        System.out.println("Long max value = " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue - 2);

        byte byteNumber = 110;
        short shortNumber = 2000;
        int intNumber = 10000;

        long longNumber = (50000L + (byteNumber + shortNumber + intNumber) * 10L);
        System.out.println(longNumber);
    }
}
