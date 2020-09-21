package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        //System.out.println("Your final score was " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Seb", highScorePosition);

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;







    }






    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000){
            return  1;
        } else if (playerScore > 500 && playerScore < 1000 ){
            return  2;
        } else if (playerScore > 100 && playerScore < 500){
            return  3;
        } else{
            return  4;
        }
    }



}
