package org.example;

public class Main {
    public static void main(String[] args) {

        String name = "Yunus Oz";

        int length = name.length(); // length of String
        char letter = name.charAt(0); // letter at that index
        int index = name.indexOf("s"); // index of a letter
        int lastIndex = name.lastIndexOf("z");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        //name = name.toUpperCase();
        //name = name.toUpperCase();
        //name = name.trim();
        //System.out.println(name);
        //name = name.replace("O", "A");

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else {
            System.out.println("Hello " + name);
        }

        if (name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else {
            System.out.println("Your name DOESN'T contain any spaces");
        }

        if (name.equalsIgnoreCase("password")){
            System.out.println("Your name cvant be password");
        }
        else {
            System.out.println("Hello " + name);
        }


    }
}