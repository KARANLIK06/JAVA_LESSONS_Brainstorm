package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '3';

        if (ch >= '0' && ch <= '9') {

            System.out.println("Dijit");

        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println("Alphabetic");

        } else {

            System.out.println("Special Character");
        }


    }
}
