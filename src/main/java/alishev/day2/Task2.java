package day2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task2.class.getName());
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                logger.log(Level.INFO, " " + i);
            }
        }
    }
}