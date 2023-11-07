package findTheWinnerOfAnArrayGame;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int getWinner(int[] arr, int k) {
        int count = 0;
        int count1 = 0;
        int length = arr.length;
        List<Integer> listResult = new ArrayList<>();
        List<Integer> listArray = new ArrayList<>();
        for (Integer a : arr) {
            listArray.add(a);
        }
        System.out.println(listArray + " COUNT " + count + " COUNT_1 " + count1);
        for (int i = 0; i != -1; ) {
            if ((listArray.get(i)) < (listArray.get(i + 1))) {
                if (listResult.contains(listArray.get(i + 1))) {
                    listResult.add(listArray.get(i + 1));
                    listArray.add(listArray.get(i));
                    listArray.remove(i);
                } else {
                    listResult.clear();
                    listResult.add(listArray.get(i + 1));
                    listArray.add(listArray.get(i));
                    listArray.remove(i);
                }
            } else if ((listArray.get(i)) > (listArray.get(i + 1))) {
                if (listResult.contains(listArray.get(i))) {
                    listResult.add(listArray.get(i));
                    listArray.add(listArray.get(i + 1));
                    listArray.remove(i + 1);
                } else {
                    listResult.clear();
                    listResult.add(listArray.get(i));
                    listArray.add(listArray.get(i + 1));
                    listArray.remove(i + 1);
                }
            }
            if (listResult.size() == k) {
                return listResult.get(0);
            }
            if (listResult.size() > length) {
                return listArray.get(i);
            }
        }
        return 0;
    }
}