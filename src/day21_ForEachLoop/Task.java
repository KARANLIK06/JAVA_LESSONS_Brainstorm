package day21_ForEachLoop;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 9};


        int[] merged = new int[arr1.length + arr2.length];

        //MY SOLUTION WITH FOR LOOPS

        for (int i = 0, j = 0; i < arr1.length; j++, i++) {

            merged[j] += arr1[i];

        }

        for (int i = 0, j = arr1.length; i < arr2.length; j++, i++) {

            merged[j] += arr2[i];

        }


        System.out.println(Arrays.toString(merged));
    }
}
