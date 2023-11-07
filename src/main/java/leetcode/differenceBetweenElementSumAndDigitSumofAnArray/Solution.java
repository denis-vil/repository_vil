package differenceBetweenElementSumAndDigitSumofAnArray;

public class Solution {
    public int differenceOfSum(int[] nums) {
        int countOne = 0;
        int countTwo = 0;
        for (Integer integer : nums) {
            countTwo += integer;
        }
        for (int i = 0; i < nums.length; i++) {
            if (Integer.toString(nums[i]).length() >= 2) {
                countOne += sumChar(nums[i]);
            } else {
                countOne += nums[i];
            }
        }
        return countTwo - countOne;
    }

    int sumChar(int number) {
        char[] charStr = Integer.toString(number).toCharArray();
        int counte = 0;
        for (Character numb : charStr) {
            counte += Integer.parseInt(String.valueOf(numb));
        }
        return counte;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.differenceOfSum(new int[]{1, 4, 5, 11}));
    }
}