package question13;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
