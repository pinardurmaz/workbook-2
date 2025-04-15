package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a game score: ");
        String input = scanner.nextLine().trim();

        String[] mainParts = input.split("\\|");
        String[] teams = mainParts[0].split(":");
        String[] scores = mainParts[1].split(":");

        String team1 = teams[0];
        String team2 = teams[1];

        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        String winner;
        if (score1 > score2) {
            winner = team1;
        } else if (score2 > score1){
            winner =team2;
        } else{
            winner = " It's a tie!";
        }
        System.out.println( "Winner: " + winner);
    }
}
