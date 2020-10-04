package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was " + score);
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        int a = 5;
        int b = 6;
        int sum = a + b;

        if(sum < 20 && sum > 10 ) {
            System.out.println("Sum is = " + 20);
        } else {
            System.out.println("Sum is = " + sum);
        }

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }
    }
}
