package perfectNumber;

public class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < 28; i++) {
            if (28 % i == 0) {
                sum += i;
            }
            if (sum == num) {
                return true;
            }
        }
        return false;
    }
}