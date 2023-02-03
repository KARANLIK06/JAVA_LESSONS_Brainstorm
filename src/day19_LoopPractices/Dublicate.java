package day19_LoopPractices;

import java.util.Scanner;

public class Dublicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int a = str.indexOf(ch);
            int b = str.lastIndexOf(ch);
            if (a!=b) {
                System.out.println("ch = " + ch);
                System.exit(0);
            }
        }
        scan.close();

    }
}

