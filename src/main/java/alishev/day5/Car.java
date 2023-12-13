package day5;

public class Car {
    int year;
    String color;
    String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void getInfo() {
        System.out.println("Это автомобиль");
    }

    public int differenceInYears(int yearTwo) {
        return Math.abs(yearTwo - year);
    }

    public void setModel(String model) {
        this.model = model;
    }
}