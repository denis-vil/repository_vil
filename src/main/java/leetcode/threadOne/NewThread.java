package threadOne;

public class NewThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Вывод: " + i);
        }
    }

    public static void main(String[] args) {
        NewThread thread = new NewThread();
        thread.start();
    }
}
