package task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfArrayElements = scanner.nextInt();
        int numberOfRequests = scanner.nextInt();
        int[] array = new int[numberOfArrayElements + 1];
        for (int i = 1; i <= numberOfArrayElements; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < numberOfRequests; i++) {
            char symbol = scanner.next().charAt(0);
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            if (symbol == '+') {
                int x = scanner.nextInt();
                for (int j = l; j <= r; j++) {
                    array[j] += x;
                }
            } else {
                int k = scanner.nextInt();
                int b = scanner.nextInt();
                int maxVal = Integer.MIN_VALUE;
                for (int j = l; j <= r; j++) {
                    maxVal = Math.max(maxVal, Math.min(array[j], k * j + b));
                }
                System.out.println(maxVal);
            }
        }
    }
}