package org.example;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args)throws Exception {


        int user_input;
        int computer_input;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter Input : ");
        user_input = scanner.nextInt();

        Random computer = new Random();
        computer_input = computer.nextInt(3);

        //String user_move;
        String computer_move;

        if (computer_input == 0){
            computer_move = "Rock";
        } else if (computer_input == 1) {
            computer_move = "Paper";
        }else {
            computer_move = "Scissor";
        }

        if (user_input == 0) {
            System.out.println("You  " + "Rock");
            System.out.println("  vs  ");
            System.out.println("computer: " + computer_move);
        } else if (user_input == 1) {
            System.out.println("You " + "Paper");
            System.out.println("  vs  ");
            System.out.println("computer: " + computer_move);
        } else if (user_input == 2) {
            System.out.println("You " + "Scissor");
            System.out.println("  vs  ");
            System.out.println("computer: " + computer_move);
        } else {
            System.out.println("Enter a valid input between 0 to 2 and Try Again...!!");
        }

        if (computer_input == user_input){
            System.out.println("\nmatch drawn");
        } else if ((user_input==0 && computer_input==2) || (user_input==1 && computer_input==0) || (user_input==2 && computer_input==1)) {
            System.out.println("\nYou Won");
        } else if ((user_input>2) || (user_input<0)) {
            System.out.println();
        } else {
            System.out.println("\nComputer won");
        }

    }
}
