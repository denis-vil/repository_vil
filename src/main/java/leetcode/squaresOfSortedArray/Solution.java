package squaresOfSortedArray;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                array[i] = Math.abs(nums[i]) * Math.abs(nums[i]);
            } else {
                array[i] = nums[i] * nums[i];
            }
        }
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}