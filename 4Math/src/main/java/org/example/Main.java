package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //double x = 3.34;
        //double y = -10;

        //double z = Math.max(x,y); // gives the larger number

        //double z = Math.min(x,y); // gives the smaller number

        //double z = Math.abs(y); // gives the absolute value of a number

        //double z = Math.sqrt(y); // gives the square root of a number

        //double z = Math.round(x); // will round

        //double z = Math.ceil(x); // will round up

        //double z = Math.floor(x); // will round down

        //System.out.println(z);
        //System.out.println(z);

        // Finding the hypotonaus

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter a number for side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotrnuse is : " + z);

        scanner.close();

    }
}