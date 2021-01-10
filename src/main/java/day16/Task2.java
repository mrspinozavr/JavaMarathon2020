package day16;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        createIntFile(file1);
        createDoubleFile(file1, file2);
        printResult(file2);
    }

    public static void createIntFile(File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                pw.print(random.nextInt(101));
                pw.print(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void createDoubleFile(File file1, File file2) {
        try (Scanner scanner = new Scanner(file1)) {
            String[] nums = scanner.nextLine().split(" ");
            PrintWriter pw = new PrintWriter(file2);
            for (int i = 0; i < 1000; i = i + 20) {
                double sum = 0;
                for (int j = i; j < i + 20; j++) {
                    sum += Integer.parseInt(nums[j]);
                }
                pw.print("" + sum / 20 + " ");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            double sum = 0;
            String[] nums = scanner.nextLine().split(" ");
            for (String num : nums) {
                sum += Double.parseDouble(num);
            }
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
