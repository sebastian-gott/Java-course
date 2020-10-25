package com.company;

import java.util.Scanner;

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


            int[] scores = new int[10];
            int score = 0;
            int count = 0;
            int total = 0;
            final int QUIT = 999;
            final int MAX = 10;
            Scanner input = new Scanner(System.in);
        System.out.println("Enter the quiz score or "  + QUIT + " to quit >>");
        score = input.nextInt();
        while(score != QUIT) {
            scores[count] = score;
            total += scores[count];
            ++count;
            if(count == MAX)
                score = QUIT;
            else {
                System.out.println("Enter next quiz value or " + QUIT + " to exit >>");
            }
        }

        System.out.println("\n The scores entered were: ");
        for(int x = 0; x < count; ++x) {
            System.out.println(scores[x] + "  ");

            if(count != 0) {
                System.out.println("\n The average is ");
                System.out.printf("%.2f", total + 1.0 / count);
            } else
                System.out.println("No scores were entered");
        }
    }
}
