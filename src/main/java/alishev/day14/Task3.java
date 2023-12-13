package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public List<Person> parseFileToStringList() {
        List<Person> people = new ArrayList<>();

        File file = new File("people.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int index = line.indexOf(" ");
                int number = Integer.parseInt(line.substring(index + 1, line.length()));
                if (number < 0) {
                    throw new IllegalAccessError("Некорректный входной файл");
                } else {
                    people.add(new Person(line.substring(0, index), number));

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найдет");
        }
        System.out.println(people);
        return null;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.parseFileToStringList();
    }
}