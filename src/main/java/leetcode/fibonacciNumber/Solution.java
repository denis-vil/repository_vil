package fibonacciNumber;

public class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        if (n == a) {
            return a;
        }
        if (n == b) {
            return b;
        }
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}