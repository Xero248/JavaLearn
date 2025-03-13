package org.example;

public class printRow {

    static void PrintRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ",row));
        System.out.println("**************");
    }
}
