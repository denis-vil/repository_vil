package reverseStringII;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {
    private static Logger logger = Logger.getLogger(Solution.class.getName());

    public String reverseStr(String s, int k) {
        String result = "";
        String temp = "";
        int count = 0;
        if (s.length() < k) {
            return new StringBuilder(s).reverse() + "";
        }
        for (int i = 0; i < s.length(); i += k) {
            if (count % 2 == 0 && i + k < s.length()) {
                temp = s.substring(i, i + k);
                result += new StringBuilder(temp).reverse();
            } else if (i + k < s.length()) {
                result += s.substring(i, i + k);
            } else if (count % 2 == 0) {
                temp = s.substring(i, s.length());
                result += new StringBuilder(temp).reverse();
            } else {
                result += s.substring(i, s.length());
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl", 39);
        logger.log(Level.INFO, result);
    }
}