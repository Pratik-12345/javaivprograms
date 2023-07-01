package org.example;

import java.util.Scanner;

public class UseCase_Practice {
    public static void main(String[] args) {

        double math;
        double eng;
        double science;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Math Marks : ");
        math = sc.nextDouble();
        System.out.print("Enter ENGLISH Marks : ");
        eng = sc.nextDouble();
        System.out.print("Enter Science Marks : ");
        science = sc.nextDouble();

        double avg = (math + eng + science)  / 3;
        System.out.println(avg);

        if (avg>=40 && math>=33 && eng>=33 && science>=33){
            System.out.println("\nCongrats "+name+" You are Passed the Test");
        }else {
            System.out.println("\nSorry...!! "+name+" You are Failed.. Better Luck Next TimeP");
        }


    }
}
