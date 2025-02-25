package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random(); // not true random but psudo random

        int x = random.nextInt(6)+1; // limied the random numbers to 6 and added + 1 so it does not count zero

        double y = random.nextDouble(); // range from 0 to 1

        boolean z = random.nextBoolean();

        float j = random.nextFloat();

        System.out.println(y);
    }
}