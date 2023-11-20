package maximumProductOfTwoElementsInAnArray;

import java.util.Arrays;

public class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(new int[]{3, 4, 5, 2}));
    }
}