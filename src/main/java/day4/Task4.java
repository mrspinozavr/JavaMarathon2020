package day4;

public class Task4 {
    public static void main(String[] args) {
        getSumm(arrayInit(100));
    }

    public static int[] arrayInit(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        return array;
    }

    public static void getSumm(int[] array) {
        int sum = 0, tempSum = 0, indexSum = 0;
        for (int i = 2; i < array.length; i++) {
            tempSum = array[i - 2] + array[i - 1] + array[i];
            if (sum < tempSum) {
                sum = tempSum;
                indexSum = i - 2;
            }
        }
        System.out.printf("Максимальная сумма в тройке элементов %d, индекс первого элемента %d", sum, indexSum);
    }
}
