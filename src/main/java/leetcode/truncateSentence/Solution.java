package truncateSentence;

public class Solution {
    public String truncateSentence(String s, int k) {
        char[] str = s.toCharArray();
        int index = 0;
        int count = 0;
        String charStr = " ";
        for (int i = 0; i < str.length; i++) {
            String temp = String.valueOf(str[i]);
            if (charStr.equals(temp)) {
                index = i;
                count++;
                if (count == k) {
                    return s.substring(0, index);
                }
            }
        }
        return s;
    }
}