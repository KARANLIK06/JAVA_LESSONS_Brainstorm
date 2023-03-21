package interview;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the factorial number to be calculated");
        int factorialNum = scan.nextInt();
        int factorialSum=1;

        for (int i = 1; i <=factorialNum ; i++) {
            factorialSum=factorialSum*i;
        }
        System.out.println("Factorial of " + factorialNum + " is " + factorialSum);
    scan.close();
    }

}
