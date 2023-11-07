package concatenationOfArray;

import java.util.Arrays;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] arrayResult;
        arrayResult = Arrays.copyOf(nums, nums.length * 2);
        for (int i = nums.length; i < nums.length * 2; i++) {
            arrayResult[i] = nums[i - nums.length];
        }
        return arrayResult;
    }
}