package day05_Concatenation;

public class StudentInfo {
    public static void main(String[] args) {
        /*
        2. Create a class called StudentInfo, and declare variables for the
followings:
1. student name (String)
2. age (int)
3. gender (char)
4. school name (String)
5. phone number (String) (###)-###-####
6. full time (boolean)
         */
        String student_name = "Ali";
        int age = 35;
        char gender = 'M';
        String school_name = "Cydeo";
        String phone_number = "(123)-456-7890";
        boolean isfull_time = true;

        System.out.println("student_name    = " + student_name);
        System.out.println("age             = " + age);
        System.out.println("gender          = " + gender);
        System.out.println("school_name     " +
                "= " + school_name);
        System.out.println("phone_number    = " + phone_number);
        System.out.println("isfull_time     = " + isfull_time);

    }
}
