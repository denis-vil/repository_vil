package reverseInteger;

public class Solution {
    public int reverse(int x) {
        boolean positive = x > 0;
        char[] arr = String.valueOf(Math.abs(x)).toCharArray();
        String result = "";
        if (positive) {
            for (int i = arr.length - 1; i >= 0; i--) {
                result += arr[i];
            }
        } else {
            result += "-";
            for (int i = arr.length - 1; i >= 0; i--) {
                result += arr[i];
            }
        }
        if (String.valueOf(result.charAt(result.length() - 1)).equals("-")) {
            result = result.substring(0, result.length() - 2);
        }
        long test = Long.valueOf(result);
        if (test > Integer.MAX_VALUE || test < Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.valueOf(result);
    }
}