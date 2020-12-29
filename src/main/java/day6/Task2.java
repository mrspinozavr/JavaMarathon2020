package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2015, 74, 300000);
        airplane.setYear(2017);
        airplane.setLength(80);
        airplane.info();
        airplane.fillUp(400);
        airplane.info();
        airplane.fillUp(500);
        airplane.getFuel();
        airplane.info();
    }
}
