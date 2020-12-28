package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2020, "Red", "Yamaha");
        System.out.printf("%s %s %d", bike.getModel(), bike.getColor(), bike.getYearOfBuild());
    }
}

class Motorbike {
    private int yearOfBuild;
    private String color;
    private String model;

    public Motorbike(int yearOfBuild, String color, String model) {
        this.yearOfBuild = yearOfBuild;
        this.color = color;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }
}
