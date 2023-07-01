package org.example;

public class LoopPractice {
    public static void main(String[] args) {

        /*
        * Write a Program to Print the following patter

         * * * *
         * * *
         *  *
         *

        * */

      /*  int n = 4;

        for (int i=n; i>0; i-- ){
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        // write a program to sum first n even numbers using while loop

        int sum = 0;
        int n =  4;

        for (int i = 0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.println(sum);
    }
}
