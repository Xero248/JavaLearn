package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Supra", "Black");
        Car car3 = new Car("Nissan R34", "Blue");

        //Car[] cars = new Car[3];

        Car[] cars = {car1, car2, car3};

//        Car[] cars =  {new Car("Mustang", "Red"),         // anonymous object with no unique identifier
//                       new Car("Supra", "Black"),
//                       new Car ("Nissan R34", "Blue")};

//        for (int i = 0; i < cars.length; i++) {
//            cars[i].drive();
//        } // end normal for loop 

        for(Car car : cars) {
            car.drive();
        }


    }
}