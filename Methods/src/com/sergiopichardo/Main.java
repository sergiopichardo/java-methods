package com.sergiopichardo;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);

        int player1HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Sergio", player1HighScorePosition);

        int player2HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Elon", player2HighScorePosition);

        int player3HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Larry", player3HighScorePosition);

        int player4HighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Steve", player4HighScorePosition);

        int player5HighScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jon", player5HighScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int playerHighPosition) {
        System.out.println(playerName + " managed to get into position "
                + playerHighPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;   // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
