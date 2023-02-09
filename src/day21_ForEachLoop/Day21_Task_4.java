package day21_ForEachLoop;

import java.util.Arrays;

public class Day21_Task_4 {
    public static void main(String[] args) {
        String [] words= {"anna", "level", "Java"};
        String result="";
        int count=0;

        for (String word : words) {
           String temp="";
           for (int i= word.length()-1; i>=0; i--){
               temp+=word.charAt(i);
           }
           if (word.equalsIgnoreCase(temp)){
               result=temp;
               count++;
           }
        }
        System.out.println(count);

    }
}
/*
4. write a program that can count how many palindromes in an array of string
Ex:
{"anna", "level", "Java"};
output:
2
 */