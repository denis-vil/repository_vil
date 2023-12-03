package threadOne;

public class TwoThread extends Thread {
    public TwoThread(StringBuilder str) {
        this.stringBuilder = str;
    }

    StringBuilder stringBuilder;

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.println(stringBuilder);
                char currentChar = stringBuilder.charAt(0);
                currentChar++;
                stringBuilder.setCharAt(0, currentChar);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StringBuilder stringBuilder1 = new StringBuilder("a");
        TwoThread thread1 = new TwoThread(stringBuilder1);
        TwoThread thread2 = new TwoThread(stringBuilder1);
        TwoThread thread3 = new TwoThread(stringBuilder1);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();


    }
}
