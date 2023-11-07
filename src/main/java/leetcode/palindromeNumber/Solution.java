package palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reversed = 0;
        if (temp < 0) {
            return false;
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }
            System.out.println(x);
            System.out.println(reversed);
            if (x == reversed) {
                return true;
            } else {
                return false;
            }
        }
    }
}