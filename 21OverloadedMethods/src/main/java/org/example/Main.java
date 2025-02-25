package org.example;

public class Main {
    public static void main(String[] args) {

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameter

        System.out.println(add(1,2));

        String pizza = bakePizza("flat bread", "mozzarella", "chicken");
        System.out.println(pizza);

    }
    static double add(double a , double b) {
        return a + b;
    }

    static double add(double a , double b, double c) {
        return a + b + c;
    }

    static double add(double a , double b, double c, double d) {
        return a + b + c + d;
    }

    static String bakePizza(String bread) {
        return bread + " Pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " Pizza";
    }

    static String bakePizza(String bread, String cheese, String toppings) {
        return toppings + " " + cheese + " " + bread + " Pizza";
    }
}