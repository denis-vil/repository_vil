package day1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task4.class.getName());
        int age = 28;
        while (age <= 100) {
            logger.log(Level.INFO, "Мой возраст " + age);
            age += 5;
        }
    }
}