package countTheDigitsThatDivideNumber;

public class Solution {
    public int countDigits(int num) {
        String str = String.valueOf(num);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((num % (str.charAt(i)-'0')) == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countDigits(1248));
    }
}