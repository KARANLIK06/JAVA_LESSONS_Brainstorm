package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinAverage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9) );

        int max= list.get(0);
        int min= list.get(0);
        int sum =0;

        for (Integer each : list) {
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
            sum+=each;
        }
        double average= sum/ list.size();

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);

    }
}
/*
2. Write a program that can find the maximum, minimum and average number from an arrayList of integers
 */