// Number Game

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        
        // Game Loop
        boolean keepPlaying;
        int roundsWon = 0;
        int totalRounds = 0;

        do {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasWon = false;

            System.out.println("\nI have chosen a number between 1 and 100. Try to guess it within " + maxAttempts + " attempts.");

            // Attempt Loop
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (" + (attempts + 1) + " of " + maxAttempts + "): ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Too low!");
                } else if (guess > targetNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts.");
                    roundsWon++;
                    hasWon = true;
                    break;
                }
            }

            if (!hasWon) {
                System.out.println("You've used all your attempts. The number was: " + targetNumber);
            }

            totalRounds++;

            // Check if the user wants to play another round
            System.out.print("Would you like to play another round? (yes/no): ");
            keepPlaying = scanner.next().trim().toLowerCase().equals("yes");
        } while (keepPlaying);

        // End of game summary
        System.out.println("\nGame Over. You won " + roundsWon + " out of " + totalRounds + " rounds.");
        scanner.close();
    }
}
