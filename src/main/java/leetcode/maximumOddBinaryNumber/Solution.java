package maximumOddBinaryNumber;

import java.util.*;

public class Solution {
    public String maximumOddBinaryNumber(String s) {
        List<Integer> listInteger = new ArrayList<>();

        Integer[] arrayInt = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arrayInt[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Arrays.sort(arrayInt, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrayInt));
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            temp = temp + String.valueOf(arrayInt[i]);
            if (i == s.length() - 1) {
                listInteger.add(Integer.valueOf(temp));
            }

        }
        System.out.println(listInteger);
        return "g";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maximumOddBinaryNumber("3730");
    }
}