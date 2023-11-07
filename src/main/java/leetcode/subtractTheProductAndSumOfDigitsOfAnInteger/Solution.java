package subtractTheProductAndSumOfDigitsOfAnInteger;

public class Solution {
    public int subtractProductAndSum(int n) {
        String nStr = Integer.toString(n);
        char[] nChar = nStr.toCharArray();
        int digits = Character.getNumericValue(nChar[0]);
        int sum = Character.getNumericValue(nChar[0]);
        for (int i = 1; i < nChar.length; i++) {
            sum = sum + Character.getNumericValue(nChar[i]);
            digits = digits * Character.getNumericValue(nChar[i]);

        }
        return digits - sum;
    }
}