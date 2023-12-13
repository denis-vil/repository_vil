package elementAppearingMoreThanInSortedArray;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        int max = 0;
        int count = 0;
        int result = 0;
        if (arr.length == 1) {
            return arr[0];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (i + 1 == arr.length && (arr[i] == arr[i + 1])) {
                count++;
                count++;
            } else if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
                result = arr[i];
            }
        }
        return result;
    }
}