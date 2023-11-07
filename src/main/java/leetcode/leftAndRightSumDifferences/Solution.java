package leftAndRightSumDifferences;

public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int result[] = new int[nums.length];
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                right = right + nums[j];
            }
            for (int d = 0; d < i; d++) {
                left = left + nums[d];
            }
            int temp = left - right;
            if (temp < 0) {
                temp = temp * (-1);
            }
            result[i] = temp;
            temp = 0;
            left = 0;
            right = 0;
        }

        return result;
    }
}