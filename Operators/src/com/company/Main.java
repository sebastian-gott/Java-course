package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println( "previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And this is a test");
            }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You've got the top score");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than top score and less than 100");
        }
    }
}
