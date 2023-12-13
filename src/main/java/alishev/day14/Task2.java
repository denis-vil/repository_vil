package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public List<String> parseFileToStringList() {
        List<String> people = new ArrayList<>();

        File file = new File("people.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                people.add(line);
            }
            for (int i = 0; i < people.size(); i++) {
                String temp = people.get(i);
                int index = people.get(i).indexOf(" ") + 1;
                if (Integer.parseInt(temp.substring(index, temp.length())) < 0) {
                    throw new IllegalAccessError("Некорректный входной файл");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найдет");
        }
        System.out.println(people);
        return null;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.parseFileToStringList();
    }
}