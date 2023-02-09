package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str ="Java";
        char[] chars =str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for(char each : str.toCharArray()){
            System.out.print(each);
        }
        System.out.println();
        System.out.println("-----------------------------");
        String  sentence="I love learning java programming language";
        String [] words =sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("---------------------------------");

        String sentence2="Today is nice day. Today is Monday. Today we learn Java";
        String[] word2=sentence2.split("\\.");
        System.out.println(Arrays.toString(word2));

    }
}
