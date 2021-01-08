package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File peopleFile = new File("people.txt");
        System.out.println(parseFileToStringList(peopleFile));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> nameList = new ArrayList<>();
        String[] temp;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                temp = s.split(" ");
                if (Integer.parseInt(temp[1]) > 0) {
                    nameList.add(s);
                } else {
                    System.out.println("Некорректный входной файл");
                    break;
                }
            }
        } catch (FileNotFoundException f) {
            System.out.println("Файл не найден");
        }
        return nameList;
    }
}
