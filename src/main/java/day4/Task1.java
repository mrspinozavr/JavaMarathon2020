package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = arrayInit(new Scanner(System.in).nextInt());
        System.out.println(Arrays.toString(array));
        arrayInfo(array);
    }

    public static int[] arrayInit(int n) {
        if (n > 0) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * 10);
            }
            return array;
        } else {
            return null;
        }
    }

    public static void arrayInfo(int[] array) {
        if (array != null) {
            int evenCounter, oddCounter, equals1, moreThan8, sum;
            sum = evenCounter = oddCounter = equals1 = moreThan8 = 0;
            for (int x : array) {
                if (x > 8) {
                    moreThan8++;
                } else if (x == 1) {
                    equals1++;
                }
                if ((x % 2) == 0) {
                    evenCounter++;
                } else oddCounter++;
                sum += x;
            }
            System.out.println("Длина массива: " + array.length);
            System.out.println("Количество чисел больше 8: " + moreThan8);
            System.out.println("Количество чисел равных 1: " + equals1);
            System.out.println("Количество четных чисел: " + evenCounter);
            System.out.println("Количество нечетных чисел: " + oddCounter);
            System.out.println("Сумма всех элементов массива: " + sum);
        } else {
            System.out.println("Информации нету, пустой массив");
        }
    }
}
