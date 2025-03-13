package org.example;

import java.util.Random;

public class spinRow {

    static String[] genRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();



        for (int i = 0; i < 3; i++) {
            row[i] = (symbols[random.nextInt(symbols.length)]);
        }

        return row;
    }
}
