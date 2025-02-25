package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        //               .substring(start, end)

        Scanner scanner = new Scanner(System.in);

//        String email = "Example123@gmail.com";
//        String username = email.substring(0,10);
//        String domain = email.substring(10, 19);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

//        String Username = email.substring(0,email.indexOf("@"));
//        String domain = email.substring(email.indexOf("@" + 1));

        if (email.contains("@")) {

            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);


            System.out.println(username);
            System.out.println(domain);

        }
        else {
            System.out.println("Warning: Emails must contain @");
        }

        scanner.close();
    }
}