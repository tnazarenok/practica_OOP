package com.company.task2_HW18;

public class Garage {
    private final Vehicle vehicle;

    public Garage(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "vehicle=" + vehicle +
                '}';
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Motorcycle("car", "unique");
        Garage garage = new Garage(vehicle);
        System.out.println(garage);
    }
}
