package day1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task6 {
    public static void main(String[] args) {
        int k = 7;
        int i = 1;
        Logger logger = Logger.getLogger(Task6.class.getName());
        while (i < 10) {
            logger.log(Level.INFO, i + " x " + k + " = " + i * k);
            i++;
        }
    }
}