package designParkingSystem;

public class ParkingSystem {
    int[] freeParkingPlace;

    public ParkingSystem(int big, int medium, int small) {
        freeParkingPlace = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (freeParkingPlace[carType - 1] > 0) {
            freeParkingPlace[carType - 1] = freeParkingPlace[carType - 1] - 1;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(1));
    }
}