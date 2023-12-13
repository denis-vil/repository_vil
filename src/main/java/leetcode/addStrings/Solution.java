package addStrings;

import java.math.BigInteger;

public class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger big1 = new BigInteger(num1);
        BigInteger bi2 = big1.add(new BigInteger(num2));
        return bi2.toString();
    }
}