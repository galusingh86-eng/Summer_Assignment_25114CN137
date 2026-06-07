// write a program to recursive sum of digits. 

import java.util.Scanner; 

public class problem_27 {

    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigits(num));

        sc.close();
    }
}


