package reverseOnlyLetters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String reverseOnlyLetters(String s) {
        String str = s;
        str = str.replaceAll("[^A-Za-z]", "");
        List<String> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            list.add(String.valueOf(chars[i]));
        }
        Collections.reverse(list);
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).matches("[^A-Za-z]")) {
                list.add(i, String.valueOf(s.charAt(i)));
            }
        }
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}