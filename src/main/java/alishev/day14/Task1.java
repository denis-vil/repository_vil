package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;
        File file = new File("input.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strArray = line.split(" ");
            if (strArray.length < 10) {
                throw new IllegalAccessError("Некорректный входной файл");
            }

            for (String str : strArray) {
                sum += Integer.parseInt(str);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найдет");
        }
        System.out.println(sum);
    }
}