package sortArrayByParityII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        int[] arrayResult = new int[list1.size() + list2.size()];
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            arrayResult[count] = list1.get(i);
            count++;
            arrayResult[count] = list2.get(i);
            count++;

        }
        return arrayResult;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortArrayByParityII(new int[]{4, 2, 5, 7})));
    }
}