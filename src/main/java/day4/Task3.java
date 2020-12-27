package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(arrayInit(12, 8)));
    }

    public static int[][] arrayInit(int m, int n) {
        int[][] array = new int[m][n];
        int tempSum, lineSum, indexOfMax;
        tempSum = lineSum = indexOfMax = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 50);
                lineSum += array[i][j];
            }
            if (lineSum >= tempSum) {
                tempSum = lineSum;
                indexOfMax = i;
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + indexOfMax);
        return array;
    }
}
