package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class TestArraysUtility {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("-----------------------------------");

        double[] arr2={1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("-----------------------------------");

        char[] arr3={'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("-----------------------------------");

        String [] arr4 ={"Anna","Java","Python","Cydeo"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("-----------------------------------");

        int[] num1={10,5,9,5,2,0};
        int maximum1=ArraysUtility.max(num1);
        System.out.println("maximum1 = " + maximum1);

        System.out.println("-----------------------------------");

        double[] num2={2.5,3.9,7.6,9.8,20.5};
        double maximum2=ArraysUtility.max(num2);
        System.out.println("maximum2 = " + maximum2);

        System.out.println("-----------------------------------");

        int[] cont1={10,5,9,5,2,0};
        boolean contain1=ArraysUtility.contains(cont1,9);
        System.out.println("contain1 = " + contain1);

        System.out.println("-----------------------------------");


    }
}
