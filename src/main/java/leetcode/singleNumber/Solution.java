package singleNumber;

public class Solution {

    public int singleNumber(int[] nums) {

        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    result = nums[i];
                }
            }
            if (count != 2) {
                return result;
            } else {
                count = 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{2, 2, 1}));
    }
}