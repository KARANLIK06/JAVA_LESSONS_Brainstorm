package day15_ForLoop;

import java.util.Scanner;

public class ReplaceFirst {
    public static void main(String[] args) {
        System.out.println("Please enter a word");
        String word = new Scanner(System.in).next();


        if (word.charAt(0) == 'x'){
            word=word.replaceFirst("x","a");
        }
            System.out.println(word);





     }

}
