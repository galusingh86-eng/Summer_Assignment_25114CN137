// write a program to sort words by length.

import java.util.Scanner;

public class problem_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Split sentence into words
        String[] words = str.split(" ");

        // Sort words according to length
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Words sorted by length:");

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}