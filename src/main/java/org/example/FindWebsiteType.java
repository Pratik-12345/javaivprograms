package org.example;

import java.util.Scanner;

public class FindWebsiteType {
    public static void main(String[] args) {

        String website;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Website : ");
        website = scanner.next();

        if (website.endsWith(".com")){
            System.out.println(website+" is a commercial website.");
        } else if (website.endsWith(".org")) {
            System.out.println(website+" is am organizational website.");
        }else if (website.endsWith(".in")){
            System.out.println(website+" is an Indian website.");
        }else {
            System.out.println(website+" is invalid...!!");
        }

    }
}
