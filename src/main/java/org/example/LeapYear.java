package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year : ");
        year = scanner.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0 || (year % 400 == 0))){
            System.out.println("This year is a leap year.");
        }else {
            System.out.println("This year is not a leap year.");
        }
    }
}
