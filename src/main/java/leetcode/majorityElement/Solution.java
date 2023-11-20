package majorityElement;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        int max = nums.length / 2;
        if (nums.length % 2 != 0) {
            max = (nums.length + 1) / 2;
        }
        int count = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(max);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count++;
                if (count >= max) {
                    return nums[i];
                }
                count = 0;
            }
            if (count >= max) {
                return nums[i];
            }
            if (i == nums.length - 2 && count == max - 1) {
                return nums[nums.length - 1];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{2, 2}));
    }
}