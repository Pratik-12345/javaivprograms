package org.example;

import java.util.Scanner;

public class IncomTaxCalculator {
    public static void main(String[] args) {

        double amount;
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name = scanner.next();
        System.out.print("Enter Your Total Income (in lack) : ");
        amount = scanner.nextDouble();


         if (amount>2.5 && amount<=5.0) {
            System.out.println("Hey "+name+", You have to pay "+((amount-2.5)/5)*100 );
        } else if (amount>5.0 && amount<=7.5) {
            System.out.println("Hey "+name+", You have to pay "+((amount-2.5)/10)*100 );
        }else if (amount>7.5 && amount<=10.0){
            System.out.println("Hey "+name+", You have to pay "+((amount-2.5)/15)*100 );
        }else if (amount>10.0){
            System.out.println("Hey "+name+", You have to pay "+((amount-2.5)/30)*100 );
        }else {
             System.out.println("Hey "+name+", No need to pay tax..!!");
         }
    }
}
