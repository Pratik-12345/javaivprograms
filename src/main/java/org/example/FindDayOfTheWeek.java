package org.example;

import java.util.Scanner;

public class FindDayOfTheWeek {
    public static void main(String[] args) {

        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day : ");
        day = scanner.nextInt();

        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        System.out.println("\nThank You");
    }
}
