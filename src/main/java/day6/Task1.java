package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("White");
        car.setModel("Renault Logan");
        car.setYear(2020);
        Motorbike bike = new Motorbike("Yamaha", "Red", 2020);
        car.info();
        bike.info();
        System.out.println(car.yearDifference(2012));
        System.out.println(bike.yearDifference(2015));
    }
}
