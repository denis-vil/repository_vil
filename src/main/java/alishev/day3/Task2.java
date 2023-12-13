package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();

        while (true) {
            if (divisor == 0) {
                break;
            } else {
                System.out.println(dividend / divisor);
            }
            dividend = scanner.nextInt();
            divisor = scanner.nextInt();
        }
    }
}