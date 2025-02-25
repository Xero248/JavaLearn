package org.example;

public class Main {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double Price = 9.99;

        if (isStudent){
            if (isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                Price *=0.7;

            }
            else {
                System.out.println("You get a student discount of 10%");
                Price *= 0.9;
            }

        }
        else {
            if (isSenior){
                System.out.println("You get a senior discount of 20%");
                Price *= 0.8;
            }
            else {
                Price *= 1;
            }
        }

        System.out.printf("The price of the ticket is: $%.2f", Price);

    }
}