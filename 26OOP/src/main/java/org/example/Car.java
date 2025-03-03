package org.example;

public class Car {

    String make = "BMW";
    String model = "M5";
    int year = 2025;
    double price = 80000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You break the " + model);
    }

}
