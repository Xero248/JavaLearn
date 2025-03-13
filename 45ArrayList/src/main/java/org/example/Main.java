package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ArrayList = A resizable array that stores objects (autoboxing).
        //             Arrays are fixed in sie, but ArrayLists can change

        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(1);
//        list.add(2);
//
//        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(1);
        //fruits.set(1, "Pineapple");


        //System.out.println(fruits.get(1));
        //System.out.println(fruits.size());

        Collections.sort(fruits);

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        scanner.close();
    }
}