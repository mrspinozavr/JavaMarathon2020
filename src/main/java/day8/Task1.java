package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        long finish = System.currentTimeMillis();
        System.out.println(sb);
        System.out.printf("Работа цикла с StringBuilder заняла %d мс\n", finish - start);
        start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            result += i + " ";
        }
        finish = System.currentTimeMillis();
        System.out.printf("Работа цикла с String заняла %d мс\n", finish - start);
    }
}
