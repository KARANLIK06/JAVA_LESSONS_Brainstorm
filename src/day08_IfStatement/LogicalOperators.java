package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 19;
        String citizen = "ABD";
        String name = "Aaron";

        boolean isEligible = age >= 18 && citizen == "ABD";

        System.out.println(name + " is eligible to vote :" + isEligible);

        System.out.println("----------------------------------");

        int age2 = 23;
        int creditScore = 750;
        String name2 = "Ally";

        boolean isEligible2 = creditScore > 700 && age2 > 25;

        System.out.println(name2 + " is eligible for loan :" + isEligible2);

        System.out.println("--------------------------------------");

        int age3 = 23;
        char gender = 'M';
        String name3 = "Mark";

        boolean isEligible3 = age3>=18 && (gender=='M' || gender=='F');

        System.out.println(name3 + " is eligible to register :" + isEligible3);
    }
}
