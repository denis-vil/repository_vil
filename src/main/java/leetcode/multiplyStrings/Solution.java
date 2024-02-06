package multiplyStrings;

import java.math.BigInteger;

public class Solution {
    public String multiply(String num1, String num2) {
        return String.valueOf(new BigInteger(num1).multiply(new BigInteger(num2)));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("123", "456"));
    }
}