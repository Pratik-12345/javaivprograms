package org.example;

public class StringLowerCase {

    public static void main(String[] args) {

        String s = "ABHILIPSA_PATTJOSHI";
        System.out.println("Before converting to lower : "+s);

        System.out.println();

        //use of LowerCase
        String lower_s = s.toLowerCase();
        System.out.println("After String conversion : "+lower_s);

        // use of replace keyword
        String afterReplace = s.replace("_"," ");
        System.out.println("\nString after replacing special character : "+afterReplace);

        String letter = "Dear <|name|>, Thanks a lot...!!";
        System.out.println("after replacing : "+letter.replace("<|name|>", "Lipu"));

        // find double and triple spaces in a string
        String name = "My Name  is   Pratik Panda";

        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

        // to format the letter using escape sequence

        String myLetter = "\nDear Lipu,\n\tI Love You So Much.\n\tThanks for lighting up my LIFE.";
        System.out.println(myLetter);
    }
}
