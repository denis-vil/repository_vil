package day5;

public class Motorbike {
    int year;
    String color;
    String model;

    public void getInfo() {
        System.out.println("Это мотоцикл");
    }

    public int differenceInYears(int yearTwo) {
        return Math.abs(yearTwo - year);
    }

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }


    public String getColor() {
        return color;
    }


    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "year=" + year +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}