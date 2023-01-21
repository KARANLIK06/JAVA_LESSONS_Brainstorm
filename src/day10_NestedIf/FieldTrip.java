package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 6;
        String location = "";
        int groupNumber = 0;
        String teacher = "";

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie Theater";
                groupNumber = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                groupNumber = 5;
                teacher = "Ms. Lela";
            } else {
                location = "Six Flags";
                groupNumber = 8;
                teacher = "Mr. Watt";

            }
        } else {
            System.out.println("Invalid Grade");
        }

        System.out.println("grade - " + grade + "\nlocation - " + location + "\nnumber of group - " + groupNumber + "\nteacher in charge - " + teacher);


    }
}
