package org.example;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
        System.out.println("****************");
        System.out.println("BAKING PROGRAM");
        System.out.println("****************");

        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("****************");

        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }

        System.out.println("****************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("****************");

        scanner.close();
    }
    static void showBalance(double balance) {
        System.out.printf("Your Balance is: $%.2f\n", balance);
    }

    static double deposit() {

        double amount;

        System.out.print("Enter a amount to deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount get can't be negative");
            return 0;
        }
        else {
         return amount;
        }
    }

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter a amount to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds ");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            balance -= amount; // Deduct the amount
            System.out.printf("Successfully withdrew: $%.2f\n", amount);
            System.out.printf("Remaining balance: $%.2f\n", balance); // Show updated balance
            return amount;
        }
    }
}