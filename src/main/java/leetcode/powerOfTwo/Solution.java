package powerOfTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        int result = n;
        while (true) {
            if ((result % 2) == 0) {
                result = result / 2;
            } else if (result == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(3));
    }
}