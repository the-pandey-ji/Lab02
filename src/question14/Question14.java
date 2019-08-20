package question14;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), num1 = 0;
        int n = num;
        while (num != 0) {
            num1 = (num1 * 10) + num % 10;
            num /= 10;
        }
        if (n == num1) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }

    }
    }
