package rotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int[][] array = new int[matrix.length][matrix[0].length];
        int cow = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[j][cow] = matrix[i][j];
            }
            cow--;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}