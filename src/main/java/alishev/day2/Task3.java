package day2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task3.class.getName());
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a + 1;
        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0) {
                logger.log(Level.INFO, " " + i);
            }
            i++;
        }
    }
}