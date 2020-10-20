package com.company;

public class Main {

    public static void main(String[] args) {


        //CReate an array
        int[] age = {12, 4, 5, 2, 5};

        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        for(int a : age) {
            System.out.println(a);
        }

        int[] numbers = {2, -9, 0, 2, 7, 2, 5, 6};

        int sum = 0;
        double average;
        //Access all elements with for loop
        //Adds each element in sum
        for(int number : numbers) {
            sum += number;
        }
        //Totalt antall elementer
            int arrayLength = numbers.length;
        //Kalkuler
        //Caster verdiene til double
            average = ((double)sum / (double)arrayLength);

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

    }
}
