package day17_While_DoWhile;

import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me");
        String ask= scan.next().toLowerCase();

        while (!(ask.equals("yes")||ask.equals("no"))){
            System.err.println("Invalid answer.Please re-enter.");
            System.err.println("Will you marry me");
            ask= scan.next().toLowerCase();

        }
        if (ask.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodby");
        }
        scan.close();
    }
}
