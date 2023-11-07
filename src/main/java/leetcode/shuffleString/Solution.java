package shuffleString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String restoreString(String s, int[] indices) {
        List<Character> listCharter = new ArrayList<>();
        while (true)
            for (int i = 0; i < s.length(); i++) {
                listCharter.add(s.charAt(search(indices, i)));
                if (listCharter.size() == s.length()) {
                    return listCharter.stream().map(String::valueOf).collect(Collectors.joining());
                }
            }
    }

    int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return 0;
    }
}