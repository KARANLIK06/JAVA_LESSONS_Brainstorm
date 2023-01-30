package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str=scan.nextLine();

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

        }
        scan.close();

    }
}
