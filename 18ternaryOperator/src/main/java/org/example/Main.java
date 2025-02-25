package org.example;

public class Main {
    public static void main(String[] args) {

        // ternary operator ? = return 1 or 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        String PassOrFall = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(PassOrFall);

        int number = 3;

        String EvenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(EvenOrOdd);

        int hours = 13;

        String TimeOfDay = (hours < 12) ? "A.M." : "P.M.";

        System.out.println(TimeOfDay);

        int income = 60000;

        double TaxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(TaxRate);



    }
}