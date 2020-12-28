package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Renault Logan");
        car.setColor("White");
        car.setYearOfBuild(2020);
        System.out.printf("%s %s %d", car.getModel(), car.getColor(), car.getYearOfBuild());
    }
}

class Car {
    private int yearOfBuild;
    private String color;
    private String model;

    public int getYearOfBuild() {
        return yearOfBuild;
    }

    public void setYearOfBuild(int yearOfBuild) {
        this.yearOfBuild = yearOfBuild;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
