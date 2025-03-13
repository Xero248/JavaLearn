package org.example;

public class Main {
    public static void main(String[] args) {

        // They help protect data and add rules for accessing or modifying them.
        // Getters = Methods that make a field READABLE
        // SETTERS = Methods that amke a field WRITEABLE

        Car car = new Car("Nissan Skyline R34", "Blue", 20000);

        car.setColor("Black");
        car.setPrice(-100);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}