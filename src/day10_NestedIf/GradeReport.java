package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int note=90;
        if(note>=0 && note<=100) {
            if (note >= 90 ) {
                System.out.println("Excellent");
            } else if (note >= 80 ) {
                System.out.println("Great");
            } else if (note >= 70) {
                System.out.println("Good");
            } else if (note >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Note");
        }
        System.out.println("-----------------------");

        String result="";

        if(note>=0 && note<=100) {
            if (note >= 90 ) {
                result="Excellent";
            } else if (note >= 80 ) {
                result="Great";
            } else if (note >= 70) {
                result="Good";
            } else if (note >= 60) {
                result="Passed";
            } else {
                result="Failed";
            }
        }else{
            result="Invalid Note";
        }
        System.out.println(result);

    }
}
