package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> evenNums = initNewArrayEvenNums();
        System.out.println(evenNums);
    }

    public static List<Integer> initNewArrayEvenNums() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 30; i += 2) {
            nums.add(i);
        }
        for (int i = 300; i <= 350; i += 2) {
            nums.add(i);
        }
        return nums;
    }
}
