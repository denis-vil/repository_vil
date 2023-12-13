package day3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task1.class.getName());
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (check) {
            if (str.equals("Stop")) {
                break;
            } else if (str.equals("Moscow") || str.equals("Vladivostok") || str.equals("Rostov")) {
                logger.log(Level.INFO, "Russia");
            } else if (str.equals("Rim") || str.equals("Milan") || str.equals("Turin")) {
                logger.log(Level.INFO, "Italy");
            } else if (str.equals("Berlin") || str.equals("Munich") || str.equals("Koln")) {
                logger.log(Level.INFO, "Germany");
            }
            str = scanner.nextLine();
        }
    }
}