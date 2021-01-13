package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int i) {
        if (i < 10) return (i == 7) ? 1 : 0;
        return count7( i / 10) + count7(i % 10);
    }
}

