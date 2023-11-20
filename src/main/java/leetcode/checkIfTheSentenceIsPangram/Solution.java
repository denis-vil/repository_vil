package checkIfTheSentenceIsPangram;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] array = sentence.toCharArray();
        String[] array1 = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = String.valueOf(array[i]);
        }
        Set<String> list = new TreeSet<>(Arrays.asList(array1));
        return list.size() == 26;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
    }
}