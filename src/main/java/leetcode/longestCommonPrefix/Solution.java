package longestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Comparator<String> stringLengthComparator = new StringLengthSort();
        int count = 0;
        int countTwo = 0;
        String result = "";
        if (strs.length == 1 && strs[0].equals("\"\"")) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        } else {
            Arrays.sort(strs, stringLengthComparator);
            System.out.println(Arrays.toString(strs));
            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    countTwo++;
                    if (strs[0].charAt(i) == strs[j].charAt(i)) {
                        count++;
                    } else {
                        return result;
                    }
                }
                countTwo = 0;
                if (count == strs.length - 1) {
                    result = result + strs[countTwo].charAt(i);
                    if (strs[0].length() == result.length()) {
                        return result;
                    } else {
                        count = 0;
                    }
                }
            }
        }
        return result;
    }

    class StringLengthSort implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() > o2.length()) {
                return 1;
            } else {
                if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));
    }
}