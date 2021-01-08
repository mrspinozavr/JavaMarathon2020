package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File textFile = new File("text.txt");
        printSumDigits(textFile);
    }

    public static void printSumDigits(File file) {
        int sum = 0;
        try (Scanner scanner = new Scanner(file)) {
            String[] nums = scanner.nextLine().split(" ");
            if (nums.length != 10) {
                System.out.println("Некорректный входной файл");
            } else {
                for (String num : nums) {
                    sum += Integer.parseInt(num);
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException f) {
            System.out.println("Файл не найден");
        }
    }
}
