package threadOne;

import java.util.ServiceLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadOne implements Runnable {
    ReentrantLock reentrantLock = new ReentrantLock();
    int number = 0;


    @Override
    public void run() {
        reentrantLock.lock();
        number++;
        reentrantLock.unlock();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ThreadOne threadOne = new ThreadOne();
        for (int i = 0; i < 4000; i++) {
            executorService.submit(threadOne);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadOne.number);
    }
}
