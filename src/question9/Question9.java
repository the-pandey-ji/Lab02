package question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if (ch <= 90 && ch >= 65) {
            System.out.println((char) (ch + 32));
        } else {
            System.out.println((char) (ch - 32));
        }
    }
}
