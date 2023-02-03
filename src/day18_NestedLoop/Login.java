package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a username");
        String user = scan.next();
        System.out.println("Enter a password");
        String pass = scan.next();

        if (user.equals("Cydeo") && pass.equals("WoodenSpoon")) {
            System.out.println("Logged In");
        } else {
            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect username and password");
                System.out.println("Enter a username");
                user = scan.next();
                System.out.println("Enter a password");
                pass = scan.next();

                if (user.equals("Cydeo") && pass.equals("WoodenSpoon")) {
                    System.out.println("Logged In");
                    break;
                }

            }
            if (!(user.equals("Cydeo") && pass.equals("WoodenSpoon"))) {
                System.out.println("Your account is locked.Please contact your support team");
            }
        }
        scan.close();
    }
}
