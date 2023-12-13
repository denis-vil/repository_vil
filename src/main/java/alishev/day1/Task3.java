package day1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 {
    static Logger logger = Logger.getLogger(Task3.class.getName());

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            logger.log(Level.INFO, "JAVA" + " ");
        }
    }
}