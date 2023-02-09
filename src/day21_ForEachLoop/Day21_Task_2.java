package day21_ForEachLoop;

import java.util.Arrays;

public class Day21_Task_2 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        for (int evenNumber : numbers) {
            if (evenNumber%2==0) {
                System.out.print(evenNumber + " ");
            }
        }
        System.out.println();
        System.out.println("------------------");

        for (int oddNumber : numbers) {
            if (oddNumber%2==1) {
                System.out.print(oddNumber + " ");
            }
        }

    }
}
/*
2. Write a program that can count the even and odd number from an array of integers
Note: MUST use for each loop
 */