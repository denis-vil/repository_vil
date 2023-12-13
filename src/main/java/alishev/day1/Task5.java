package day1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task5 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task5.class.getName());
        int age = 28;
        for (int i = age; i <= 100; i += 5) {
            logger.log(Level.INFO, "Мой возраст " + i);
        }
    }
}