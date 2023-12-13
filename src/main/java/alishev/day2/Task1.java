package day2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task1.class.getName());
        Scanner scanner = new Scanner(System.in);
        int flour = scanner.nextInt();
        if (flour > 0) {
            if (flour < 5) {
                logger.log(Level.INFO, "Малоэтажный дом");
            } else if (flour < 9) {
                logger.log(Level.INFO, "Среднеэтажный дом");
            } else if (flour > 9) {
                logger.log(Level.INFO, "Многоэтажный дом");
            }
        } else {
            logger.log(Level.INFO, "Введите положительное число");
        }
    }
}