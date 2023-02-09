package day21_ForEachLoop;

import java.util.Arrays;

public class Day21_Task_1 {
    public static void main(String[] args) {
        int [] numbers = {5,9,50,25,12,7};
        Arrays.sort( numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------");

        int[] number = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
          //  System.out.print(Arrays.toString(new int[]{numbers[i]}));  // Output:  [50][25][12][9][7][5]
            number[i]=numbers[numbers.length-1-i];
        }
        System.out.println(Arrays.toString(number));

            }

        }

/*
1. Write a program that sort the array of integer in descending order
 */