package org.example;

public class Main {
    public static void main(String[] args) {

        // array = used to store multiple values in a single variable

        //String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"}; // have to be same data type if not it will be a type mismatch

        //cars[0] = "Mustang"; // reassigne elemnt 0 as mustang

       // System.out.println(cars[3]);

        String[] cars = new String[3]; // assigning how many elements we want

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


    }
}