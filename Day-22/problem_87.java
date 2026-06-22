// write a program to find character frequency.

import java.util.Scanner;

public class problem_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Display character frequency
        System.out.println("Character Frequency:");

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char)i + " : " + frequency[i]);
            }
        }

        sc.close();
    }
}