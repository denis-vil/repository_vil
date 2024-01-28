package happyNumber;


public class Solution {
    public boolean isHappy(int n) {
        int result = 0;
        String number = String.valueOf(n);
        int count = 0;
        while (count < 100) {
            count++;
            for (int i = 0; i < number.length(); i++) {
                result += (Integer.valueOf(String.valueOf(number.charAt(i))) * Integer.valueOf(String.valueOf(number.charAt(i))));
            }
            System.out.println(result);
            if (result == 1) {
                return true;
            } else if (count > 100) {
                return false;
            } else {
                number = String.valueOf(result);
                result = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(2));
    }
}