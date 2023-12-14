package task1;

import java.util.Scanner;

public class Task1 {
    static char T = 'T';
    static char I = 'I';
    static char N = 'N';
    static char K = 'K';
    static char O = 'O';
    static char F = 'F';
    static int[] numberOfDigits = new int[]{1, 1, 1, 1, 1, 2};

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int numberOfInputDataSets = scanner.nextInt();
        scanner.nextLine();
        while (numberOfInputDataSets > 0) {
            numberOfInputDataSets--;
            String str = scanner.nextLine();
            if (str.length() != 7) {
                System.out.println("No");
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == T) {
                        numberOfDigits[0]--;
                    } else if (str.charAt(i) == I) {
                        numberOfDigits[1]--;
                    } else if (str.charAt(i) == N) {
                        numberOfDigits[2]--;
                    } else if (str.charAt(i) == K) {
                        numberOfDigits[3]--;
                    } else if (str.charAt(i) == O) {
                        numberOfDigits[4]--;
                    } else if (str.charAt(i) == F) {
                        numberOfDigits[5]--;
                    }
                }
                for (int i = 0; i < numberOfDigits.length; i++) {
                    sum += numberOfDigits[i];
                }
                if (sum > 0) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }
}