package org.example;

public class Main {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object
        //               By default, it returns a hash code as a unique identifier
        //               it can be overridden to provide meaningful details.

        Car car1 = new Car("Nissan", "Skyline R34", 1998, "Blue");
        Car car2 = new Car("Honda", "Accord ", 2024, "Platinum");

        System.out.println(car1);
        System.out.println(car2);

//        System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);
    }
}