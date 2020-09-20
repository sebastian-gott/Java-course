package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 10, 1200);
        calculateScore(true, 2000, 9, 100);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

}
