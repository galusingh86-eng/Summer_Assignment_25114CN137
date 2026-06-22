// write a program to count words in a sentence.

import java.util.Scanner;

public class problem_86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int count = 0;

        // Count words
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }

        // Add 1 for the last word
        if (sentence.length() > 0) {
            count++;
        }

        System.out.println("Number of words: " + count);

        sc.close();
    }
}