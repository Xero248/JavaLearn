package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("If you wish to convert lbs(pounds) to kg(kilogram) select option 1");
        System.out.println("If you wish to convert kg(kilogram) to lbs(pounds) select option 1");
        System.out.println();
        System.out.print("Please make a choice option 1 or 2: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You chose option 1 ");
            System.out.print("enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kg is: %.2f",newWeight);

        } else if (choice == 2) {
                System.out.println("You chose option 2 ");
                System.out.print("enter the weight in kg: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("The new weight in lbs is: %.2f",newWeight);

        } else {
            System.out.println("That was not a valid choice!");
        }


        scanner.close();
    }
}