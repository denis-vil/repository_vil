package lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        char[] str = s.trim().toCharArray();
        int count = 0;
        for (int i = str.length - 1; i > 0; i--) {
            String temp = String.valueOf(str[i]);
            if (!temp.equals(" ")) {
                count++;
            } else {
                return count;
            }
        }
        return str.length;
    }
}