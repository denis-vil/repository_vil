package moveZeroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}