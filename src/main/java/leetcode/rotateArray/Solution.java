package rotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k == 0) return;
        int count = 0;
        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[]{-1, -100, 3, 99}, 2);
    }
}