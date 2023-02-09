package day21_ForEachLoop;

public class Day21_Task_3 {
    public static void main(String[] args) {
       int[] arr1= {1,2,3,4,5};
       int[] arr2= {4,5,6,7,8};
        for (int eachAar1 : arr1) {
            for (int eachAar2 : arr2) {
                if(eachAar1==eachAar2){
                    System.out.print(eachAar1+" ");
                }

            }

        }


    }
}
/*
3. Write a program that can print out the common elements from two integer array
Ex:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}
output:
4 5
MUST use for each loops
 */