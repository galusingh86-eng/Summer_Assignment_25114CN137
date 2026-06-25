// write a program to sort words alphabetically.

import java.util.Scanner;
import java.util.Arrays;

public class problem_99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Split sentence into words
        String[] words = str.split(" ");

        // Sort words alphabetically
        Arrays.sort(words);

        System.out.println("Words in alphabetical order:");

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}