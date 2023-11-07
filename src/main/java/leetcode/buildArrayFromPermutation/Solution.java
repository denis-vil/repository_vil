package buildArrayFromPermutation;

public class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            result[i] = nums[nums[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = solution.buildArray(new int[]{0, 2, 1, 5, 3, 4});
        for (Integer arrays : array) {
            System.out.print(" " + arrays);
        }
    }
}