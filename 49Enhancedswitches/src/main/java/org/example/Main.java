package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //                   (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

//        switch (day){
//            case "Monday" -> System.out.println("It is a weekday"); // -> = do this / do something
//            case "Tuesday" -> System.out.println("It is a weekday");
//            case "Wednesday" -> System.out.println("It is a weekday");
//            case "Thursday" -> System.out.println("It is a weekday");
//            case "Friday" -> System.out.println("It is a weekday");
//            case "Saturday" -> System.out.println("It is the weekend");
//            case "Sunday" -> System.out.println("It is the weekend");
//            default -> System.out.println(day + " Is not a day");
//
//        }

        // can consolidate like this
        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday"); // -> = do this / do something
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " Is not a day");

        }



        scanner.close();
    }
}