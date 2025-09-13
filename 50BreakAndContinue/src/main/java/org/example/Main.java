package org.example;

public class Main {
    public static void main(String[] args) {

        // break = break out of a loop (STOP)
        // Continue = Skip current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++){

            if (i == 5){
               // break;        // stops when at the fifth iteration
                continue;       // skips the fifth iteration
            }


            System.out.print(i + " ");
        }
    }
}