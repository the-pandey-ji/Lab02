package question12;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), temp = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                temp += 1;
            }
        }
        if (temp == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is a composite number.");
        }
    }
}
