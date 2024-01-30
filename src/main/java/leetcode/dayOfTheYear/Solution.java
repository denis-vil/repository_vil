package dayOfTheYear;

import java.time.LocalDate;

public class Solution {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dayOfYear("2019-02-10"));
    }
}