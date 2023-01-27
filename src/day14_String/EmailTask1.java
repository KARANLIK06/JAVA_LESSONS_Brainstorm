package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the email");
        String email = scan.nextLine();

        String firstName=email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

       // System.out.println("firstName = " + firstName);
       // System.out.println("lastName = " + lastName);
       // System.out.println("rest = " + rest);

        email=lastName+"_"+firstName+rest;
        System.out.println(email);
        scan.close();

    }
}
