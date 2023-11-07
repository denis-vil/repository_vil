package divisibleAndNonDdivisibleSumsDifference;

public class Solution {
    public int differenceOfSums(int n, int m) {
        int sumDel = 0;
        int sumNotDel = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumDel += i;
            } else {
                sumNotDel += i;
            }
        }
        return sumNotDel - sumDel;
    }
}