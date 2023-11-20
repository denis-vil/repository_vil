package sortingTheSentence;

import java.util.Arrays;

public class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        String resultStr = "";
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            result[(words[i].charAt(words[i].length() - 1) - '0') - 1] = words[i];
            result[(words[i].charAt(words[i].length() - 1) - '0') - 1] = result[(words[i].charAt(words[i].length() - 1) - '0') - 1].replaceAll("[^A-Za-zА-Яа-я]", "");
        }
        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                resultStr = resultStr + result[i];
            } else {
                resultStr = resultStr + result[i] + " ";
            }
        }
        return resultStr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sortSentence("is2 sentence4 This1 a3"));
    }
}