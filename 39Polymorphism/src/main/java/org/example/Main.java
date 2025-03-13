package org.example;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                 Objects can identify as other objects/
        //                 objects can be treated as objects of a common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

//        car.go();
//        bike.go();
//        boat.go();

        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}