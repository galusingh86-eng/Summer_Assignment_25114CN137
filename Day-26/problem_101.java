// write a program to create number guessing game.

import java.util.Scanner;
import java.util.Random;

public class problem_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 1 and 100
        int number = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High! Try again.");
            } 
            else if (guess < number) {
                System.out.println("Too Low! Try again.");
            } 
            else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != number);

        sc.close();
    }
}