package org.example;

public class Main {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object
        //                   Allows use of Collections Framework and static Utility Methods.

//        Integer a = new Integer(123);            // old way DON'T USE
//        Double b = new Double(3.14);            // old way DON'T USE
//        Character c = new Character('$');       // old way DON'T USE
//        Boolean d = new Boolean(true);          // old way DON'T USE



        // Modern way and should do it this way

        // Autoboxing
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;
//
//        // Unboxing
//
//        int x = a;
//        double y = b;
//        char z = c;
//        boolean t = d;

//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('@');
//        String d = Boolean.toString(false);
//
//        String x = a + b + c +d;
//
//        System.out.println(x);

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        char letter ='b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}