package plusOne;

import java.util.*;

public class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        List<Integer> listIndex = new ArrayList<>();
        if (digits.length == 1) {
            if (digits[0] == 9) {
                return new int[]{1, 0};
            } else {
                return new int[]{digits[0] + 1};
            }
        }
        if (digits.length == 2) {
            if (digits[0] == 9 && digits[1] == 9) {
                return new int[]{1, 0, 0};
            } else if (digits[0] != 9 && digits[1] == 9) {
                return new int[]{digits[0] + 1, digits[1] = 0};
            } else {
                return new int[]{digits[0], digits[1] + 1};
            }
        }
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            int[] result = digits;
            return result;
        } else if (check(digits)) {
            digits[0] = 1;
            int[] result = new int[digits.length + 1];
            Arrays.fill(result, 0);
            result[0] = 1;
            return result;
        } else {
            for (Integer number : digits) {
                list.add(number);
            }
            for (int i = list.size() - 1; i > 0; i--) {
                if (list.get(i) == 9) {
                    listIndex.add(i);
                } else {
                    break;
                }
            }
            Collections.sort(listIndex);
            int indexMin = listIndex.get(0) - 1;
            list.set(indexMin, list.get(indexMin) + 1);
            for (int i = 0; i < listIndex.size(); i++) {
                list.set(listIndex.get(i), 0);
            }
            return convert(list);
        }
    }

    int[] convert(List<Integer> list) {
        int[] arrayList = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrayList[i] = list.get(i);
        }
        return arrayList;
    }

    boolean check(int[] array) {
        int count = 0;
        for (Integer a : array) {
            if (a == 9) {
                count++;
            }
        }
        if (count == array.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{2, 4, 9, 3, 9})));
    }
}