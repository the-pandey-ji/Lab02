package question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.next().trim().charAt(0);
        char ch2 = scanner.next().trim().charAt(0);
        System.out.println(ch2 + " " + ch1);
        scanner.close();
    }
}
