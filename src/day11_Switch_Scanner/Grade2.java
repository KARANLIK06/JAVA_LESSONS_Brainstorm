package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
  /*      char ch ='C';

        switch (ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;

            default:
                System.out.println("Failed");

 */
        char ch ='F';
        String result = "";

        switch (ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
               result="Passed";
                break;
            case 'F':
                result="Failed";
                break;

            default:
                result="Invalid";
        }
        System.out.println(result);

    }
}
