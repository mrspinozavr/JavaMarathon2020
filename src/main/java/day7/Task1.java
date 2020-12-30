package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2015, 74, 300000);
        Airplane airplane1 = new Airplane("Aerobus", 2019, 90, 201000);
        Airplane.compareAirplanes(airplane, airplane1);
    }
}