package validSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        return oneRules(board) && twoRules(board) && threeRules(board);
    }

    // Each row must contain the digits 1-9 without repetition.
    private boolean oneRules(char[][] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                s += chars[i][j];
            }
            s = s.replaceAll("\\.", "");
            if (check(s)) {
                return false;
            }
            s = "";
        }
        return true;
    }

    //Each column must contain the digits 1-9 without repetition.
    private boolean twoRules(char[][] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                s += chars[j][i];
            }
            s = s.replaceAll("\\.", "");

            if (!check(s)) {
                return false;
            }
            s = "";
        }
        return true;
    }

    private boolean threeRules(char[][] chars) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!traverseSubMatrix(chars, i, j, i + 3, j + 3)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean traverseSubMatrix(char[][] matrix, int startRow, int startCol, int endRow, int endCol) {
        String s = "";
        for (int row = startRow; row < endRow; row++) {
            for (int col = startCol; col < endCol; col++) {
                s += matrix[row][col];
            }
        }
        s = s.replaceAll("\\.", "");
        if (!check(s)) {
            return false;
        }
        return true;
    }

    private boolean check(String s) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(String.valueOf(s.charAt(i)));
        }
        return set.size() == s.length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));

        System.out.println(solution.isValidSudoku(new char[][]{
                {'7', '.', '.', '.', '4', '.', '.', '.', '.'},
                {'.', '.', '.', '8', '6', '5', '.', '.', '.'},
                {'.', '1', '.', '2', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '9', '.', '.', '.'},
                {'.', '.', '.', '.', '5', '.', '5', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}}));

    }
}