package sortArrayByParity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        List<Integer> listC = new ArrayList<>(list1);
        listC.addAll(list2);
        int[] resultArray = new int[listC.size()];
        for (int i = 0; i < listC.size(); i++) {
            resultArray[i] = listC.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortArrayByParity(new int[]{3, 1, 4, 2})));
    }
}