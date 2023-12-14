package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giftListLength = scanner.nextInt();
        int preApprovedLoanAmount = scanner.nextInt();
        int[] prices = new int[giftListLength];
        for (int i = 0; i < giftListLength; i++) {
            prices[i] = scanner.nextInt();
        }
        int spent = 0;
        int remaining = preApprovedLoanAmount;
        for (int i = 0; i < giftListLength; i++) {
            if (remaining >= prices[i]) {
                remaining -= prices[i];
                spent += prices[i];
            } else {
                break;
            }
        }
        System.out.println(preApprovedLoanAmount - spent);
    }
}