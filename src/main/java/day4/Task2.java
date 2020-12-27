package day4;

public class Task2 {
    public static void main(String[] args) {
        arrayInfo(arrayInit(100));
    }

    public static int[] arrayInit(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        return array;
    }

    public static void arrayInfo(int[] array) {
        int min, max, counter, sum;
        min = max = array[0];
        sum = counter = 0;
        for (int x : array) {
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
            if ((x % 10) == 0) {
                counter++;
                sum += x;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + counter);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}
