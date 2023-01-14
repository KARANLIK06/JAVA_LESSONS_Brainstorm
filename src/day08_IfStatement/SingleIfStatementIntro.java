package day08_IfStatement;

import java.util.Arrays;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number= 303;
        boolean evenNumber=number%2==0;
        boolean oddNumber=number%2==1;
        if(evenNumber){
            System.out.println(number+" is even number");
        }
        if(!evenNumber){
            System.out.println(number+" is odd number");
            System.out.println("oddNumber = " + oddNumber);
        }

        System.out.println("--------------------------------");

        int number2=20;

        if(number2>0){
            System.out.println(number2 + " is positive");
        }
        if(number2<0){
            System.out.println(number2 + " is negative");
        }
        if(number2==0){
            System.out.println(number2 + " is zero");
        }

    }
}
