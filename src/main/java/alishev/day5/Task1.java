package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("black");
        car.setYear(1996);
        car.setModel("Audi");

        Motorbike motorbike = new Motorbike(1996, "Black", "Audi");
        car.getInfo();
        motorbike.getInfo();

        System.out.println(car.differenceInYears(1990));
        System.out.println(motorbike.differenceInYears(1880));
    }
}