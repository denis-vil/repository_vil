package maximum69Number;

public class Solution {
    public int maximum69Number(int num) {
        char[] array = String.valueOf(num).toCharArray();
        String resultStr = "";
        int resultInt = 0;
        for (int i = 0; i < array.length; i++) {
            if (6 == (array[i] - '0')) {
                array[i] = '9';
                for (int j = 0; j < array.length; j++) {
                    resultStr = resultStr + array[i];
                }
                resultInt = Integer.parseInt(resultStr);
                return resultInt;
            }
        }
        return resultInt;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximum69Number(9669));
    }
}