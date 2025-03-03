package org.example;

public class Main {
    public static void main(String[] args) {


            // varargs = allow a method to accept a varying # of arguments
            //           makes methods more flexible, no need for overloaded methods
            //           Java will pack the arguments into an array
            //           ...(ellipsis)

        System.out.println(average(1, 2, 3, 4));

    }
    static int add(int...numbers){

        int sum = 0;

        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double...nums){

        double sum = 0;

        if (nums.length == 0){
            return 0;
        }

        for (double num : nums){
            sum += num;
        }
        return sum / nums.length;
    }
}