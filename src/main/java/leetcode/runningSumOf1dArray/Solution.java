package runningSumOf1dArray;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            result[i + 1] = result[i] + nums[i + 1];
        }
        return result;
    }
}