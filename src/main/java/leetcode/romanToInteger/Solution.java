package romanToInteger;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] arrayNumber = s.toCharArray();
        int[] arrayNumbersInteger = new int[arrayNumber.length];
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] == 'M') {
                arrayNumbersInteger[i] = 1000;
            } else if (arrayNumber[i] == 'D') {
                arrayNumbersInteger[i] = 500;
            } else if (arrayNumber[i] == 'C') {
                arrayNumbersInteger[i] = 100;
            } else if (arrayNumber[i] == 'L') {
                arrayNumbersInteger[i] = 50;
            } else if (arrayNumber[i] == 'X') {
                arrayNumbersInteger[i] = 10;
            } else if (arrayNumber[i] == 'V') {
                arrayNumbersInteger[i] = 5;
            } else if (arrayNumber[i] == 'I') {
                arrayNumbersInteger[i] = 1;
            }
        }
        for (int i = 0; i < arrayNumbersInteger.length - 1; i++) {
            if (arrayNumbersInteger[i] < arrayNumbersInteger[i + 1]) {
                result -= arrayNumbersInteger[i];
            } else {
                result += arrayNumbersInteger[i];
            }
        }
        result += arrayNumbersInteger[arrayNumbersInteger.length - 1];
        return result;
    }
}