package question11;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        for (int i = value1 + 1; i < value2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

scanner.close();
    }
    }

