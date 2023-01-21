package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int note = 90;
        if (note >= 0 && note <= 100) {
            if (note >= 90) {
                System.out.println("Excellent");
            } else if (note >= 80) {
                System.out.println("Great");
            } else if (note >= 70) {
                System.out.println("Good");
            } else if (note >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Note");
        }

        System.out.println("----------------------------");

        String result = (note >= 0 && note <= 100) ? (note >= 90) ? "Excellent" : (note >= 80) ? "Great" : (note >= 70) ? "Good" : (note >= 60) ? "Passed" : "Failed" : "Invalid Note";
        System.out.println("result = " + result);

    }
}
