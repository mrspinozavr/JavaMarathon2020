package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
    }

//    public static int recursionSum(int[] nums) {
//        int i = nums.length;
//        if (i == 0) {
//            return 0;
//        }
//        return nums[i - 1] + recursionSum(Arrays.copyOf(nums, i - 1));
//    }
//

        public static int recursionSum(int[] nums, int i) {
        if (i == nums.length) {
            return 0;
        }
        return nums[i] + recursionSum(nums, i + 1);
    }
}
