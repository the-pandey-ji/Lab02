package question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if ((int) ch >= 48 && (int) ch <= 57) {
            System.out.println("digit");
        } else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println("alphabet");
        } else {
            System.out.println("symbol");
        }
        scanner.close();

    }
}
