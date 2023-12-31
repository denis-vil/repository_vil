package countAsterisks;

public class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean betweenBars = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                betweenBars = !betweenBars;
            } else if (s.charAt(i) == '*' && !betweenBars) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAsterisks("|**|*|*|**||***||"));
    }
}