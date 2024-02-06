package minimumAbsoluteDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> listResult = new ArrayList<>();
        Arrays.sort(arr);
        int difference = 2147483647;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = Math.abs(arr[i] - arr[i + 1]);
            if (temp < difference) {
                difference = temp;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) == difference) {
                listResult.add(List.of(arr[i], arr[i + 1]));
            }
        }
        return listResult;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumAbsDifference(new int[]{40, 11, 26, 27, -20}));
    }
}