package day13_StringClass;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        /*
        1. write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String word=scan.nextLine();

        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);

        System.out.println(first+" & "+last);
        scan.close();

    }
}
