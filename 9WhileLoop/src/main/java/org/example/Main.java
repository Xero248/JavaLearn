package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // while loop = executes a block of code as long it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name );

        // Next is a do loop though while loop is the most common

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }  while (name.isEmpty());


    }
}