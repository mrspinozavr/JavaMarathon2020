package day16;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File textFile = new File("text.txt");
        printResult(textFile);
    }

    public static void printResult(File file) {
        double sum = 0;
        double result = 0;
        try (Scanner scanner = new Scanner(file)) {
            String[] nums = scanner.nextLine().split(" ");
            for (String num : nums) {
                sum += Double.parseDouble(num);
            }
            result = sum / nums.length;
            System.out.printf(result + " --> %.3f", result);
        } catch (FileNotFoundException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

