package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("***************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("***************************");

        while (balance > 0){
            System.out.println("Current balance: $"+balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            }else {
                balance-= bet;   //balance = balance - bet;
            }

            System.out.println("Spinning...");

            row = spinRow.genRow();

            printRow.PrintRow(row);
            payout = Payout.getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout; //balance = balance + payout;
            } else {
                System.out.println("Sorry you lost this round");
            }

            System.out.print("Do you want to play again?: (Y/N)");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("GAME OVER! Your final balance is $" + balance);

        scanner.close();
    }
}