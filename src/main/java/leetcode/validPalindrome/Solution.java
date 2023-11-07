package validPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        String d = s.toLowerCase();
        d = d.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        StringBuilder stringBuilder = new StringBuilder(d);
        StringBuilder stringBuilder1 = new StringBuilder(d);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(stringBuilder1.toString())) {
            return true;
        }
        return false;
    }
}