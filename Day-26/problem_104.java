// write a program to create qiuz application.

import java.util.Scanner;

public class problem_104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("===== Quiz Application =====");

        // Question 1
        System.out.println("\n1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which language is used for Android development?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. HTML");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 1) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. object");
        System.out.println("4. create");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        System.out.println("\n===== Result =====");
        System.out.println("Your score is: " + score + "/3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score == 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}