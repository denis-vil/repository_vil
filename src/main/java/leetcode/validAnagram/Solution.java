package validAnagram;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charsArrayOne = s.toCharArray();
        char[] charsArraySecond = t.toCharArray();
        Arrays.sort(charsArrayOne);
        Arrays.sort(charsArraySecond);
        return Arrays.equals(charsArrayOne, charsArraySecond);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
    }
}