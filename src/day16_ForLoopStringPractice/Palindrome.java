package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);

        }
       boolean isPalindrom = word.equalsIgnoreCase(reverse);
        System.out.println("isPalindrom = " + isPalindrom);
        scan.close();
    }
}
