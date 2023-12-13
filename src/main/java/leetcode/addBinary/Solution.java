package addBinary;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {
    private static final Logger logger = Logger.getLogger(Solution.class.getName());

    public String addBinary(String a, String b) {
        BigInteger bigInteger1 = new BigInteger(a, 2);
        BigInteger bigInteger2 = bigInteger1.add(new BigInteger(b, 2));
        return bigInteger2.toString(2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        logger.log(Level.INFO, result);
    }
}