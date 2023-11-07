package richestCustomerWealth;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        int countSum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                countSum = countSum + accounts[i][j];
            }
            if (countSum > maxSum) {
                maxSum = countSum;
            }
            countSum = 0;
        }
        return maxSum;
    }
}