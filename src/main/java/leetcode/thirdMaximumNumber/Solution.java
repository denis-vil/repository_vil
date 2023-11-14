package thirdMaximumNumber;

import java.util.*;

public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> list = new TreeSet<>();
        if (nums.length < 3) {
            return nums[nums.length - 1];
        } else {
            for (Integer a : nums) {
                list.add(a);
            }
            int[] temp = new int[list.size()];
            int count = 0;
            for (Integer a : list) {
                temp[count] = a;
                count++;
            }
            if (temp.length < 3) {
                return temp[temp.length - 1];
            } else {
                return temp[temp.length - 3];
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.thirdMax(new int[]{2, 2, 3, 1});
    }
}