package threadOne;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution implements Runnable {
    int i;

    public Solution(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        if (i % 10 == 0) {
            System.out.println("Вывод: " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i <= 100; i++) {
            executorService.submit(new Solution(i));
        }
        executorService.shutdown();
    }
}