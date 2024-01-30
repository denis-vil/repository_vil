package duplicateZeros;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (list.get(i) == 0) {
                list.add(i, 0);
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }
}