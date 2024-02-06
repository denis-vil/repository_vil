package shift2DGrid;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> listList = new ArrayList<>();
        int indexStart = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                list.add(grid[i][j]);
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        for (int i = 0; i < grid.length; i++) {
            listList.add(list.subList(indexStart, indexStart += grid[0].length));
        }
        return listList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4));
        //[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
        System.out.println(solution.shiftGrid(new int[][]{{1}, {2}, {3}, {4}, {7}, {6}, {5}}, 23));
        //[[6],[5],[1],[2],[3],[4],[7]]
    }
}