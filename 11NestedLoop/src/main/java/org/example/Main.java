package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //nested loops = A loop inside of a loop

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String Symbol ="";

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter a symbol to use: ");
        Symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(Symbol);
            }
        }


    }
}