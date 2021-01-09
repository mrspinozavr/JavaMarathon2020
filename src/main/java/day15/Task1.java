package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File inputFile = new File("src\\main\\resources\\shoes.csv");
        File outputFile = new File("src\\main\\resources\\missing_shoes.txt");
        textWriter(missingShoesReader(inputFile), outputFile);
    }

    public static void textWriter(List<String> lines, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (String line : lines) {
                pw.println(line);
            }
        } catch (FileNotFoundException e) {
        }
    }

    public static List<String> missingShoesReader(File file) {
        List<String> text = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(Integer.parseInt(line.split(";")[2]) == 0) {
                    text.add(line.replace(";", ", "));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Входной файл не найден");
        }
        return text;
    }
}
