package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7 :");
        int num1 = scan.nextInt();
        String result = "";
        if (num1>=1 && num1<=7){
            result=(num1==1)?"Monday":(num1==2)?"Tuesday"  :(num1==3)?"Wednesday"  :(num1==4)?"Thursday"
                    :(num1==5)?"Friday":(num1==6)?"Saturday":"Sunday";

        }else{
            result ="Invalid Number";
        }
        System.out.println(result);
        scan.close();
    }
}
