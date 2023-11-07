package setMismatch;

import java.util.Arrays;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int result[] = new int[2];
        int temp[] = nums;
        Arrays.sort(temp); // dan
        int result1[] = new int[nums.length];
        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < nums.length; i++) {
            result1[i] = i + 1;
        }
        System.out.println(Arrays.toString(result1));
        for (int i = 0; i < nums.length - 1; i++) {
            if (temp[i] == temp[i + 1]) {
                result[0] = temp[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (Arrays.binarySearch(temp, i + 1) < 0) {
                result[1] = result1[i];
                return result;
            }
        }
        return result;
    }
}