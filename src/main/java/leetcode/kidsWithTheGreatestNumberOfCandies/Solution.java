package kidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> returnList = new ArrayList<>();
        int temp = 0;
        int count = 0;
        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j++) {
                temp = candies[i] + extraCandies;
                if (temp < candies[j]) {
                    count--;
                } else {
                    count++;
                }
            }
            System.out.println(count);
            if (count == candies.length) {
                returnList.add(true);
            } else {
                returnList.add(false);
            }
            count = 0;
        }
        return returnList;
    }
}