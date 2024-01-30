package dayOfTheWeek;

import java.time.LocalDate;

public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String s = "";
        if (day < 10 && month < 10) {
            s = year + "-0" + month + "-0" + day;
        } else if (day < 10) {
            s = year + "-" + month + "-0" + day;
        } else if (month < 10) {
            s = year + "-0" + month + "-" + day;
        } else {
            s = year + "-" + month + "-" + day;
        }
        String temp = LocalDate.parse(s).getDayOfWeek().name().toLowerCase();
        return temp.substring(0, 1).toUpperCase() + temp.substring(1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dayOfTheWeek(6, 8, 2019));
    }
}