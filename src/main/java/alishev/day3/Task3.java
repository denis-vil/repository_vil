package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (count < 5) {
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            count++;
            if (divisor == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(dividend / divisor);
        }
    }
}