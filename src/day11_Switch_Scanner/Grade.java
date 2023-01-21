package day11_Switch_Scanner;

import java.lang.invoke.SwitchPoint;

public class Grade {
    public static void main(String[] args) {

        char ch = 'C';
                                                           // String result="";
        switch (ch){
            case 'A':
                System.out.println("Excellent");            // result="Excellent";
                break;
            case 'B':
                System.out.println("Great job");            // result="Great job";
                break;
            case 'C':
                System.out.println("Good");                 // result="Good";
                break;
            case 'D':
                System.out.println("Passed");               // result="Passed";
                break;
            case 'F':
                System.out.println("Failed");               // result="Failed";
                break;
            default:
                System.out.println("Invalid");              // result="Invalid";

        }

                                                            // System.out.println(result);
    }
}
  /*
        3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
         */