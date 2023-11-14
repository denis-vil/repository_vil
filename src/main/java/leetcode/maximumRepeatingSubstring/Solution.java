package maximumRepeatingSubstring;

public class Solution {
    public int maxRepeating(String sequence, String word) {
        int maxK = 0;
        int k = 1;
        while (sequence.contains(word.repeat(k))) {
            maxK = k;
            k++;
        }
        return maxK;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxRepeating("aaaba aaaba aaba aaaba aaaba aaaba aaaba", "aaaba"));

    }
}